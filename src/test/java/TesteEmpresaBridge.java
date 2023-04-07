import org.example.wallace.bridge.Departamento;
import org.example.wallace.bridge.Empresa;
import org.example.wallace.bridge.EmpresaRH;
import org.example.wallace.bridge.EmpresaTI;
import org.example.wallace.bridge.EmpresaADM;
import org.example.wallace.bridge.EmpresaMKT;
import org.example.wallace.bridge.DepartamentoRH;
import org.example.wallace.bridge.DepartamentoTI;
import org.example.wallace.bridge.DepartamentoADM;
import org.example.wallace.bridge.DepartamentoMKT;

public class TesteEmpresaBridge {
    public static void main(String[] args) {
        // Criando Departamentos
        Departamento DepartamentoRH = new DepartamentoRH();
        Departamento DepartamentoTI = new DepartamentoTI();
        Departamento DepartamentoADM = new DepartamentoADM();
        Departamento DepartamentoMKT = new DepartamentoMKT();

        // Criando Empresas
        Empresa EmpresaRH= new EmpresaRH(DepartamentoRH);
        Empresa EmpresaTI = new EmpresaTI(DepartamentoTI);
        Empresa EmpresaADM = new EmpresaADM(DepartamentoRH);
        Empresa EmpresaMKT = new EmpresaMKT(DepartamentoTI);

        // Testando Contratação de funcionário
        EmpresaRH.contratarFuncionario("João", 2000.00);
        EmpresaTI.contratarFuncionario("Maria", 2500.00);
        EmpresaADM.contratarFuncionario("Antonio", 3000.00);
        EmpresaMKT.contratarFuncionario("Marta", 3500.00);

        // Testando Demissão de funcionário
        EmpresaRH.demitirFuncionario("João");
        EmpresaTI.demitirFuncionario("Maria");
        EmpresaADM.demitirFuncionario("Antonio");
        EmpresaMKT.demitirFuncionario("Marta");
    }
}