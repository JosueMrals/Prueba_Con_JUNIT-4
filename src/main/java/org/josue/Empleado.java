package org.josue;

import javax.swing.tree.ExpandVetoException;

public class Empleado {
    public static float calculaSalarioBruto(String TipoEmpleado, float ventasMes, float hExtras)  {
            if(TipoEmpleado==("vendedor"))
            {
                float sTotal;
                float sBruto = 0;
                float salario = 1000;

                if (ventasMes < 1000) {
                    float Total;
                    Total = (hExtras * 20) + sBruto;
                    return Total + salario;
                }
                if(ventasMes >= 1000 || ventasMes <= 1499)
                {
                    sBruto = salario + 100;
                }
                if (ventasMes >= 1500)
                {
                    sBruto = salario + 200;
                }
                sTotal = (hExtras *20) + sBruto;
                return sTotal;
            }
            else if (TipoEmpleado == ("encargado"))
            {
                float salario = 1500;
                float sTotal;
                float sBruto = 0;

                if (ventasMes < 1000) {
                    float Total;
                    Total = (hExtras * 20) + sBruto;
                    return Total + salario;
                }

                if(ventasMes>=1000 || ventasMes <= 1499)
                {
                    sBruto = salario + 100;
                }

                if(ventasMes >= 1500)
                {
                    sBruto = salario + 200;
                }

                sTotal = (hExtras * 20) + sBruto;
                return sTotal;
            }

        return 0;
    }

    public  double calculaSalarioNeto(float salarioBruto)
    {
        if (salarioBruto <1000)
        {
            return salarioBruto;
        }

        if(salarioBruto >= 1000 && salarioBruto< 1500)
        {
            double retencion = salarioBruto * 0.16 ;
            return salarioBruto - retencion ;
        }

        if(salarioBruto >= 1500)
        {
            double retencion = salarioBruto * 0.18 ;
            return salarioBruto - retencion;
        }
        return 0;
    }

}
