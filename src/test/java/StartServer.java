import org.eclipse.jetty.annotations.AnnotationConfiguration;
import org.eclipse.jetty.plus.webapp.EnvConfiguration;
import org.eclipse.jetty.plus.webapp.PlusConfiguration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.*;

public class StartServer {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        WebAppContext context = new WebAppContext();
        context.setContextPath("/app");
        context.setResourceBase("src/main/webapp/");

        context.setConfigurations(new Configuration[] {
                new AnnotationConfiguration(), new WebXmlConfiguration(),
                new WebInfConfiguration(),
                new PlusConfiguration(), new MetaInfConfiguration(),
                new FragmentConfiguration(), new EnvConfiguration()
        });

        context.setAttribute("org.eclipse.jetty.server.webapp.ContainerIncludeJarPattern",".*/classes/*");
        context.setParentLoaderPriority(true);

        server.setHandler(context);
        server.start();
        server.join();
    }
}
