import express, { Request, Response } from "express";
import { router } from "./config/routes";

const app = express();
app.use(express.json());
app.use(router);

console.clear();

app.get("/", (request: Request, response: Response) => {
    response.send("Hello World!");
});

app.get("/ciclo/listar/:rg/:telefone", (request: Request, response: Response) => {
    const{ rg, telefone } = request.params;
    const objeto = {
        nome : "Cesar Augusto",
        cpf :"111.111.111-11",
        idade : 21,
        rg : rg,
        telefone : telefone
    };
    response.json(objeto);
});

app.post("/ciclo/cadastrar/", (request: Request, response: Response) => {
    const pessoa = request.body;
    const objeto = {
        msg: "Cliente cadastrado com sucesso!",
        pessoa
    }
    response.json(objeto);
});



app.listen
(3000, () => {
    console.log("O servidor está rodando ...");
});