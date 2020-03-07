jQuery(function($) {

  // Mobile sidebars
  $.fn.expandableSidebar = function(expandedClass) {
    var $me = this;

    $me.on('click', function() {
      if(!$me.hasClass(expandedClass)) {
        $me.addClass(expandedClass);
      } else {
        $me.removeClass(expandedClass);
      }
    });
  }

  // Interval loop
  $.fn.intervalLoop = function(condition, action, duration, limit) {
    var counter = 0;
    var looper = setInterval(function(){
      if (counter >= limit || $.fn.checkIfElementExists(condition)) {
        clearInterval(looper);
      } else {
        action();
        counter++;
      }
    }, duration);
  }

  // Check if element exists
  $.fn.checkIfElementExists = function(selector) {
    return $(selector).length;
  }

  // Check if desktop display

  $.fn.isDesktop = function() {
    return $(window).width() > 1024;
  }

  var briskController = {
    init: function(opts) {
      var base = this;

      base._addClasses();

      setTimeout(function(){
        base._attachEvents();
      }, 1000);
    },

    _addClasses: function() {
      var base = this;

      // Add fade in class to nav + logo + banner
      $('body').addClass('fade-in');

      // Keep subnav open if submenu item is active
      $('.sidebar-nav .active').parents('.has-submenu').children('.dropdown').addClass('open');

      // Add placeholder text to inputs
      $('.wsite-form-sublabel').each(function(){
        var sublabel = $(this).text();
        $(this).prev('.wsite-form-input').attr('placeholder', sublabel);
      });
    },

    _cloneLogin: function() {
      var loginDetach = $('#member-login').clone(true);
      $('.mobile-nav .wsite-menu-default > li:last-child').after(loginDetach);
    },

    _stickyNav: function() {
      var sticky,
          collapse,
          uncollapse,
          desktopsticky = $('body.nav-position-top.sticky-nav-on:not(.wsite-checkout-page):not(.wsite-native-mobile-editor), body.nav-position-top-right.sticky-nav-on:not(.wsite-checkout-page):not(.wsite-native-mobile-editor)').length,
          mobilesticky = $('body.sticky-nav-on:not(.wsite-checkout-page):not(.wsite-native-mobile-editor)').length;

      var stickyInit = function() {
        if (!$.fn.isDesktop() || desktopsticky) {
          // Add sticky desktop nav
          sticky = new Waypoint.Sticky({
            element: $('.header')[0]
          });
        }
        if ($.fn.isDesktop() && desktopsticky) {
          // Collapse header on scroll
          collapse = new Waypoint({
            element: $('body.nav-position-top.sticky-nav-on:not(.wsite-checkout-page):not(.wsite-native-mobile-editor)')[0],
            handler: function(direction) {
              $('body').addClass('collapse');
            },
            offset: -10
          });
          uncollapse = new Waypoint({
            element: $('body.nav-position-top'),
            handler: function(direction) {
              $('body').removeClass('collapse');
            },
            offset: -5
          });
        }
      }

      stickyInit();

      $(window).resize(function() {
        if (sticky) { sticky.destroy() }
        if (collapse) { collapse.destroy() }
        if (uncollapse) { uncollapse.destroy() }
        stickyInit();
      });
    },

    _sidebarNav: function() {

      // Fixed sidebar nav unless menu height exceeds viewport height
      var sidebarCheck = function() {
        if ($.fn.isDesktop() && $('body').hasClass('sticky-nav-on') && $('.header .container').height() + $('.header .contact').height() <= $(window).height() - 45) {
          $('body.nav-position-sidebar .header').addClass('stuck');
        }
        else {
          $('body.nav-position-sidebar .header').removeClass('stuck');
        }
      }

      sidebarCheck();

      $(window).resize(function() {
        sidebarCheck();
      });
    },

    _sidebarCart: function(){
      $('#wsite-mini-cart').addClass('cart-init');

      $('.wsite-nav-cart a').click(function() {
        $('.cart-init').toggleClass('cart-visible');
      });

      $('.wrapper, .header').click(function() {
        $('.cart-init').removeClass('cart-visible');
      });
    },

    _attachEvents: function() {
    	var base = this;
        // Hamburger nav toggle
        $('.hamburger').on('click', function(e) {
          e.preventDefault();
          $('body').toggleClass('nav-open');
        });

        // Initialize sticky nav
        base._stickyNav();

        // Initialize sidebar nav
        base._sidebarNav();

      	// Copy login
        $.fn.intervalLoop('.mobile-nav #member-login', base._cloneLogin, 800, 5);

        // Subnav toggle
        $('li.has-submenu span.icon-caret, .dropdown-link').on('click', function() {
            var $me = $(this);
            if ($me.parent().hasClass('open')) {
              $me.parent().removeClass('open');
              $me.find('.open').removeClass('open');
            }
            else {
              $('.open').removeClass('open');
              $me.parents('.has-submenu').children('.dropdown').addClass('open');
            }
            setTimeout(function(){
              base._sidebarNav();
            }, 800);
        });

      // Sidebar Cart Link
      $.fn.intervalLoop('.cart-init', base._sidebarCart, 1000, 5);

      // Store category dropdown
      $('.wsite-com-sidebar').expandableSidebar('sidebar-expanded');

      // Search filters dropdown
      $('#wsite-search-sidebar').expandableSidebar('sidebar-expanded');

    	// Init fancybox swipe on mobile
      if ('ontouchstart' in window) {
        $('body').on('click', 'a.w-fancybox', function() {
          base._initSwipeGallery();
        });
      }
    },

    _initSwipeGallery: function() {
      var base = this;

      setTimeout(function(){
        var touchGallery = document.getElementsByClassName('fancybox-wrap')[0];
        var mc = new Hammer(touchGallery);
        mc.on("panleft panright", function(ev) {
          if (ev.type == "panleft") {
            $("a.fancybox-next").trigger("click");
          } else if (ev.type == "panright") {
            $("a.fancybox-prev").trigger("click");
          }
          base._initSwipeGallery();
        });
      }, 500);
    }
  }

  $(document).ready(function(){
  	briskController.init();
  });
});