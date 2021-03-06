package tf_api.keras.layers

import org.tensorflow.Operand
import org.tensorflow.Shape
import org.tensorflow.op.Ops
import org.tensorflow.op.core.Placeholder

class Input<T : Number>(vararg dims: Long) : Layer<T>() {
    private lateinit var input: Placeholder<T>
    private val packedDims: LongArray = dims

    override fun defineVariables(tf: Ops, inputShape: Shape) {
        TODO()
    }

    fun defineVariables(tf: Ops) {
        input = tf.placeholder(
            getDType(),
            Placeholder.shape(Shape.make(-1L, *packedDims))
        )
    }

    fun computeOutputShape(): Shape {
        return input.asOutput().shape()
    }


    override fun transformInput(tf: Ops, input: Operand<T>): Operand<T> {
        return input
    }

    override fun computeOutputShape(inputShape: Shape): Shape {
        TODO("Not yet implemented")
    }
}