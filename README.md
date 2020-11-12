# Issue

https://github.com/SheetJS/sheetjs/issues/2172

# Steps

```bash
(cd Java && EXPORT_ALL_COLUMN_INDEXES="0" mvn compile package exec:java)
(cd Java && EXPORT_ALL_COLUMN_INDEXES="1" mvn compile package exec:java)
cp -f wb-safe.xlsb wb.xlsb
(cd Node && yarn install && node index.js)
cp -f wb-unsafe.xlsb wb.xlsb
(cd Node && yarn install && node index.js)
```
