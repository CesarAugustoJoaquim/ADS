import { Request, Response } from "express";
import CicloSchema from "../models/CicloSchema";

class CicloController {
  async listar(request: Request, response: Response) {
    response.json(await CicloSchema.find());
  }

  listarPorId(request: Request, response: Response) {
    const { rg, telefone } = request.params;
    const objeto = {
      nome: "Diogo Steinke Deconto",
      cpf: "111.111.111-11",
      idade: 31,
      rg,
      telefone,
    };
    response.json(objeto);
  }

  async cadastrar(request: Request, response: Response) {
    try {
      const novoCiclo = await CicloSchema.create(request.body);
      response.status(201).json(novoCiclo);
    } catch (error) {
      response.status(400).json(error);
    }
  }
}

export { CicloController };