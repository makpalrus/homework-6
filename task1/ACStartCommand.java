package task1;


class ACStartCommand implements Command {
    private AirConditioner ac;

    public ACStartCommand(AirConditioner ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.start();
    }

    public void undo() {
        ac.stop();
    }
}
