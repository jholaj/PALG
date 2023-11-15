package experiments;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class Cviko09_Sorter
{
    private String dir = System.getProperty("user.dir");
    private Path path = Paths.get(dir,"report.html");
    private  File file = new File(path.toString());

    public abstract void sort(Comparable[] sequence);

    public void sortWithReport(Comparable[] sequence)
    {
        sort(sequence);
        StringBuilder html = new StringBuilder();
        html.append("<html>");
        html.append("<head>");
        html.append("<style>");
        html.append("div .box {font-family: Consolas; padding: 5px; margin: 5px; color: #000B; border-radius: 5px; width:40px; text-align: center; font-size:small}");
        html.append("</style>");
        html.append("</head>");
        html.append("<body>");
        html.append("<div style='width:100%;display: flex; flex-direction: row; flex-wrap: wrap'>");
        float counter=-1;
        for(Comparable c : sequence)
        {
            counter++;
            String color="rgba("+counter/sequence.length*255+",100,100,0.3)";
            html.append("<div class='box' style='background-color: "+color+"'>");
            html.append(c);
            html.append("</div>");
        }
        html.append("</body>");
        html.append("</html>");
        try
        {
            Files.write(path, html.toString().getBytes());
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
