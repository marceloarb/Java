public class ProjectTest {
    public static void main(String[] args){
        Project web = new Project();
        web.project("Amazon");
        String webName = web.project();
        web.project("Apple","Awesome");
        String webNameDesc = web.project();
        System.out.println(webNameDesc);
        System.out.println(webName);
        
    }
}