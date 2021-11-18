package org.josue;

import org.junit.Assert;
import org.junit.Test;

public class EmpleadosPruebas<BRException extends Throwable> extends BRException {

    @Test (expected = BRException.class)
    public void calculaSalarioBruto(){
        float resultadoReal;
        float resultadoEsperado;

        try {
            resultadoReal = Empleado.calculaSalarioBruto("vendedor", -1, 8);
            resultadoEsperado = 1360.0f;

            Assert.assertEquals(resultadoEsperado, resultadoReal, 0.001);
        } catch (BRException e) {
            fail("Se esperaba BRException");
        }
    }

    private void fail(String se_esperaba_brException) {
    }

}
