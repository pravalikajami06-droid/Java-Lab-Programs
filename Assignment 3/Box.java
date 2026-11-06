class Box {
    double width, height, depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box b1 = new Box(10, 5, 8);

        System.out.println("Volume of Box: " + b1.volume());
    }
}