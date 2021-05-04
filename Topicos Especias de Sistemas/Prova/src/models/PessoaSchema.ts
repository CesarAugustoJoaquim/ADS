import { model, Schema } from "mongoose";

const PessoaSchema = new Schema(
  {
    nome: {
      type: String,
      required: [true, "O campo nome é obrigatorio"]
    },
    cpf: {
      type: String,
      required: [true, "O campo cpf é obrigatorio"]
    },
    idade: {
      type: Number,
      min: [1, "Idade mínima de 1 ano"],
      required: [true, "O campo idade é obrigatorio"]
    }
  },
  {
    timestamps: true
  }

)

export default model("pessoas", PessoaSchema);