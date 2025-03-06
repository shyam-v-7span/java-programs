class Phone {
    private String os;
    private int ram;

    // Private Constructor
    private Phone(PhoneBuilder builder) {
        this.os = builder.os;
        this.ram = builder.ram;
    }

    static class PhoneBuilder {
        private String os;
        private int ram;

        public PhoneBuilder setOs(String os) {
            this.os = os;
            return this;
        }
        public PhoneBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Phone getPhone() {
            System.out.println("phone has " + this.os + " os and ram is " +this.ram);
            return new Phone(this);
        }
        
    }
}

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Phone phone = new Phone.PhoneBuilder()
                .setOs("Android")
                .setRam(4)
                .getPhone();
                
    }
}
