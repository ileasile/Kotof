package tf_api.keras.loss

import org.tensorflow.Operand
import org.tensorflow.op.Ops

interface LossFunction<T : Number> {
    fun getTFOperand(tf: Ops, actual: Operand<T>, labels: Operand<T>): Operand<T>
}
