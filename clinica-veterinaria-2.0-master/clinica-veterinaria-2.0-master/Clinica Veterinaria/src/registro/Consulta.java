package registro;

public class Consulta {

	private String nomeCliente;
	private String especie;
	private String horario;
	private String data;
        private String idConsulta;

        
        public String getIdConsulta() {
            return idConsulta;
        }
        public void setIdConsulta(String idConsulta) {
            this.idConsulta = idConsulta;
        }
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public Consulta() {
		
	}
	
	
	public Consulta(String nomeCliente, String especie, String horario, String data, String idConsulta) {
		super();
		this.nomeCliente = nomeCliente;
		this.especie = especie;
		this.horario = horario;
		this.data = data;
                this.idConsulta = idConsulta;
	}
	
	@Override
	public String toString() {
		return "Consulta [nomeCliente=" + nomeCliente + ", especie=" + especie + ", horario=" + horario + ", data="
				+ data + "]";
	}
	
}
