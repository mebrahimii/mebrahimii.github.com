// TODO:
// 1.) Spider should now inherit from Bug instead of Animal
//
// 2.) When a spider crawls, it should print:
//     NAME the spider crawls with spindly legs
//     You MUST call the printWithHeader method for this
//     purpose.

public class Spider extends Animal {
    public Spider(String name) {
        super(name);
    }

    public String animalType() {
        return "spider";
    }

    public void crawl() {
        printWithHeader("crawls");
    }
}
