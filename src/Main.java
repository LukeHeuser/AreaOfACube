public class Main {
    public static void main(String[] args) {

        Cuboid firstCube = new Cuboid(5,5,5);
        System.out.println(firstCube);
        System.out.println(firstCube.getArea());
        System.out.println(firstCube.getVolume());

        Rectangle firstRectangle = new Rectangle(3,3);
        Cuboid secondCube = new Cuboid(firstRectangle.getWidth(),firstRectangle.getLength(), 10);
        System.out.println(secondCube);
        System.out.println("Width of: " + secondCube.getWidth() +
                "\nLength of " + secondCube.getWidth() +
                "\nVolume is:" + secondCube.getVolume());


        Cuboid poolVolume = new Cuboid(10,30,5);
        System.out.println("The volume of a pool with a width of " + poolVolume.getWidth() +
                " feet and a length of " + poolVolume.getLength() + " feet at a depth of " + poolVolume.getHeight() +
                " feet is " + poolVolume.getVolume() + " feet cubed.");

    }
}
