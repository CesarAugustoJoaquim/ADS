import { request, Request, Response } from "express";
import PessoaSchema from "../models/PessoaSchema";

class PessoaController{

    async cadastrar(request: Request, response: Response) {
        try {
            const { nome, cpf, idade} = request.body;
            const pessoa = await PessoaSchema.findOne({ cpf: cpf});
            if(pessoa == null){
                const novaPessoa = await PessoaSchema.create(request.body);
                response.status(201).json({
                data: novaPessoa,
                error: false,
                msg: "Pessoa cadastrado com sucesso!"
                });
            }else{
                response.status(400).json({
                    data: pessoa,
                    error: false,
                    msg: "CPF já cadastrado"
                });
            }
        } catch (error) {
          response.status(400).json({
            data: error,
            error: true,
            msg: "Não foi possível adicionar a pessoa"
          });
        }
    }

    async procurarPorCPF(request: Request, response: Response){
        try{
            const { cpf } = request.params;
            const pessoa = await PessoaSchema.findOne({ cpf: cpf});
            if(pessoa != null){
                response.status(200).json({
                    data: pessoa,
                    error: false,
                    msg: "Pessoa encontrado!"
                });
            } else {
                response.status(404).json({
                    data: pessoa,
                    error: false,
                    msg: "Pessoa não encontrado!"
                });
            }
        } catch(error) {
            response.status(400).json({
                data: error,
                error: true,
                msg: "CPF invalido!"
            });
        }
    }

    async listar(request: Request, response: Response) {
        try{
          const pessoas = await PessoaSchema.find();
          response.status(200).json({
            data: pessoas,
            error: false,
            msg: "Lista de pessoas atualizada!"
          });
        } catch(error){
          response.status(400).json({
            data: error,
            error: true,
            msg: "Não foi possível listar as pessoas"
          });
        }
    }

    async alterarPorCPF(request: Request, response: Response){
        try {
            const { nome, cpf, idade} = request.body;
            const pessoa = await PessoaSchema.findOneAndUpdate({ cpf: cpf}, request.body);
            if(pessoa != null){
                response.status(200).json({
                data: pessoa,
                error: false,
                msg: "Pessoa alterada com sucesso!"
                });
            }else{
                response.status(404).json({
                    data: pessoa,
                    error: false,
                    msg: "CPF não cadastrado"
                });
            }
        } catch (error) {
          response.status(400).json({
            data: error,
            error: true,
            msg: "Não foi possível alterar a pessoa"
          });
        }
    }

    async deletar(request: Request, response: Response){
        try{
            const { cpf } = request.params;
            const pessoa = await PessoaSchema.findOneAndDelete({ cpf: cpf});
            if(pessoa != null){
                response.status(200).json({
                    data: pessoa,
                    error: false,
                    msg: "A pessoa foi deletada com sucesso!"
                });
            } else {
                response.status(404).json({
                    data: pessoa,
                    error: false,
                    msg: "Não ha ninguém cadastrado com esse CPF!"
                });
            }
        } catch(error){
            response.status(400).json({
                data: error,
                error: true,
                msg: "Não foi possível deletar a pessoa"
            });
        }
    }

}

export { PessoaController };