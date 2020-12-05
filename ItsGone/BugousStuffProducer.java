package ItsGone;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BugousStuffProducer {
    private final Writer writer;

    public BugousStuffProducer(String outputFileName) throws
            IOException {
        writer = new FileWriter(outputFileName);
    }

    public void writeStuff() throws IOException {
        writer.write("Stuff");
    }

    @Override
    public void finalize() throws IOException {
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        BugousStuffProducer bsp = new BugousStuffProducer("bugous.txt");
        bsp.writeStuff();
        //bsp.writer.flush(); is being called on closing of a file
        // if a FileWriter is not closed it wont write the buffer to disc
    }
}


