import { Schema } from "mongoose";

const CreditoSchema = new Schema({
    nome: {
        type: String,
        required: [true, "O campo nome do crédito é obrigatório!"],
    },
    valor: {
        type: Number,
        min: [0, "Valor mínimo de R$ 1,00"],
        required: [true, "O campo valor do crédito é obrigatório"],
    },
},
    {
        timestamps: true,
    }
);

export { CreditoSchema };