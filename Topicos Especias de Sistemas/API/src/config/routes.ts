import { Router } from "express";
import { CicloController } from "../controllers/CicloController";

const router = Router();
const cicloController = new CicloController();

router.get("/ciclo/listar", cicloController.listar);
router.get("/ciclo/listar/:id", cicloController.listarPorId);
router.post("/ciclo/cadastrar", cicloController.cadastrar);

export { router };