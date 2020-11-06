public abstract class Handler {
    protected Handler next;

    public void handle() {
        this.step();
        if(this.next != null)
            this.next.handle();
    };

    public abstract void step();

    public void addNext(Handler next) {
        if(this.next == null)
            this.next = next;
        else
            this.next.addNext(next);
    }
}
