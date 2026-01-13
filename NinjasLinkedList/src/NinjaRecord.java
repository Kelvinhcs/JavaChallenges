public record NinjaRecord(String name, int age, Villages village) implements Greetings{
    @Override
    public String presentation() {
        return "My name is " + this.name + " and you will not stand on my way.";
    }
    @Override
    public String battleGreeting() {
        return "You about to be defeated by " + this.name + " from " + this.village+ ".";
    }
    @Override
    public String aboutToDie() {
        return "In all my " + this.age + " years i never fought a enemy like you...";
    }

    @Override
    public String toString() {
        return "My name is: " + this.name + ".\nI have " + this.age + " years old.\nI'm from " + this.village + ".";
    }
}
