import { Router } from "express";
import { PessoaController } from "../controllers/PessoaController";
import PessoaSchema from "../models/PessoaSchema";

const router = Router();
const pessoaController = new PessoaController();

router.post("/pessoa/cadastrar", pessoaController.cadastrar);
router.get("/pessoa/buscar/:cpf", pessoaController.procurarPorCPF);
router.get("/pessoa/listar", pessoaController.listar);
router.put("/pessoa/alterar", pessoaController.alterarPorCPF);
router.delete("/pessoa/remover/:cpf", pessoaController.deletar);

export { router };