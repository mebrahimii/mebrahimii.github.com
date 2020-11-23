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
