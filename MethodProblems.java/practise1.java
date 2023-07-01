public class practise1 {
//     * find area and volume as:
//  * a. getArea:
//  * 		pass l and b as parameter
//  * 		calculate area
//  * 		return area
//  * 		call getArea in main method
//  * 
//  * b. volume:
//  * 		pass area and height as parameter
//  * 		calculate volume
//  * 		print area
//  * 		print volume
//  * 		call this method in main


static int getArea(int l, int b){
    int area = l * b;
    return area;
}
static void volume(int area, int height){
    int vol = area * height;
    System.out.println("volume:"+vol);
}
public static void main(String[] args) {
    int a = getArea(3, 5);
    System.out.println("Area:" + a);
    volume(a, 5);
   
    


}




}
