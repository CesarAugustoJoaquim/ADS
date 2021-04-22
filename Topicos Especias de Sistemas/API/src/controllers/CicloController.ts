import { Request, Response } from "express";
import CicloSchema from "../models/CicloSchema";


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

    async cadastrar(request: Request, response: Response) {
        try{      
            const novoCiclo = await CicloSchema.create(request.body);
            response.status(201).json(novoCiclo);
        } catch (error) {
            console.log(error);
            response.status(400);
        }
    }

}

export { CicloController };
