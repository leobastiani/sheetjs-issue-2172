import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Generator {
    public static void main(String[] args) throws Exception {
        Workbook wb = new Workbook();
        Worksheet ws = wb.getWorksheets().get(0);
        ws.setName("Example");
        ws.getCells().get(0, 0).setValue("A1");
        ws.getCells().get(0, 1).setValue("B1");
        ws.getCells().get(1, 0).setValue("A2");
        ws.getCells().get(2, 2).setValue("C3");
        Path path = Paths.get("..", "wb.xlsb").normalize().toAbsolutePath();
        wb.save(path.toString());
    }
}
