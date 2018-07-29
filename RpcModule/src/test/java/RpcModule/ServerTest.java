package RpcModule;

import Client.SocketClientProxy;
import Entity.Student;
import Server.Server;
import service.StudentService;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class ServerTest {

    public static void main(String[] arg) throws IOException {
        Server server = new Server(12000);
        server.start();
    }
}
