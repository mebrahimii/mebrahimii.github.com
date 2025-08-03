#include <linux/init.h>
#include <linux/module.h>
#include <linux/kernel.h>
#include <linux/list.h>

/* This function is called when the module is loaded. */
int simple_init(void)
{
       printk(KERN_INFO "Hello K200, this is Hamoun!\n");
	   printk(KERN_INFO "Congratz\n")
	   printk(KERN_INFO "If you see this message that means that you have root access!\n")

       return 0;
}

/* This function is called when the module is removed. */
void simple_exit(void) {
	printk(KERN_INFO "Goodbye Cruel World!\n");
}

/* Macros for registering module entry and exit points. */
module_init( simple_init );
module_exit( simple_exit );

MODULE_LICENSE("GPL");
MODULE_DESCRIPTION("Hamoun's First Module");
MODULE_AUTHOR("Hamoun");

