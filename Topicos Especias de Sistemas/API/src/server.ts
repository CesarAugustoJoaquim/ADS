import express, { Request, Response } from "express";
import { router } from "./config/routes";

console.clear();

const app = express();

app.use(express.json());
app.use(router);

app.listen(3000, () => {
    console.log("O servidor está rodando ...");
});