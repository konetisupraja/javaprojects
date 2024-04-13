
interface {
public void draw();}
class lambdaExpressionExample{
public static void main(String[] args){
int width=2;
suppu d=new suppu(){
public void draw(){
System.out.println("suppu"+width);
}
};
d.draw();
}
}; 