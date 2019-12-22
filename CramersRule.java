/* 
1) 3.4x+50.2y=44.5
2) 2.1x+0.55y=5.9
(Assume Cramer’s rule to solve equation
 ax+by=e x=ed-bf/ad-bc
 cx+dy=f y=af-ec/ad-bc ) 
*/
class CramersRule {
    public static void main(String argsp[]) {
        float a = 3.4f, b = 50.2f, c = 2.1f, d = 0.55f, e = 44.5f, f = 5.9f;

        System.out.println("x=" + ((e * d) - (b * f)) / ((a * d) - (b * c)));
        System.out.println("y=" + ((a * f) - (e * c)) / ((a * d) - (b * c)));
    }
}