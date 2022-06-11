public class numberOfPath {
    static int row=4,col=4,count=0;
    static void findPath(int r,int c){
        if(r>=row||c>=col){
            return;
        }
        if(r==row-1 && c==col-1){
            count++;
            return;
        }
        findPath(r,c+1);
        findPath(r+1,c);
    }
    public static void main(String[] args) {
        findPath(0,0);
        System.out.println(count);
    }
}
