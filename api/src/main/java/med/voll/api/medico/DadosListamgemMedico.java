package med.voll.api.medico;

public record DadosListamgemMedico(String nome, String email, String crm, Especialidade especialidade)
{
    public DadosListamgemMedico(Medico medico)
    {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
