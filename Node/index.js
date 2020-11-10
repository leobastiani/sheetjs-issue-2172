const XLSX = require("xlsx");
const path = require("path");

const filePath = path.resolve("..", "wb.xlsb");
const wb = XLSX.readFile(filePath, { WTF: 1 });

const firstSheetName = wb.SheetNames[0];
const ws = wb.Sheets[firstSheetName];
console.log("ws:", ws);
