/* 
1) 3.4x+50.2y=44.5
2) 2.1x+0.55y=5.9
(Assume Cramer’s rule to solve equation
 ax+by=e x=ed-bf/ad-bc
 cx+dy=f y=af-ec/ad-bc ) 
*/
class CramersRule {
    public static void main(String argsp[]) {
        float a = Float.parseFloat(System.console().readLine("Enter value of a: ")),
            b = Float.parseFloat(System.console().readLine("Enter value of b: ")), 
            c =Float.parseFloat(System.console().readLine("Enter value of c: ")), 
            d = Float.parseFloat(System.console().readLine("Enter value of d: ")), 
            e = Float.parseFloat(System.console().readLine("Enter value of e: ")),  
            f = Float.parseFloat(System.console().readLine("Enter value of f: "));

        System.out.println("x=" + ((e * d) - (b * f)) / ((a * d) - (b * c)));
        System.out.println("y=" + ((a * f) - (e * c)) / ((a * d) - (b * c)));
    }
}