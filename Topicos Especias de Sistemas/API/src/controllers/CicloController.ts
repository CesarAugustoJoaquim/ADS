import { Request, Response } from "express";


class CicloController {

    listar(request: Request, response: Response) {
        response.send("Hello World!");
    }

    listarPorId(request: Request, response: Response) {
        const { rg, telefone } = request.params;
        const objeto = {
            nome: "Cesar Augusto",
            cpf: "111.111.111-11",
            idade: 21,
            rg: rg,
            telefone: telefone
        };
        response.json(objeto);
    }

    cadastrar(request: Request, response: Response) {
        const pessoa = request.body;
        const objeto = {
            msg: "Cliente cadastrado com sucesso!",
            pessoa
        }
        response.json(objeto);
    }

}

export { CicloController };
