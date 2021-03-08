fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> (expr as Num).value
            is Sum -> eval((expr as Sum).left) + eval((expr as Sum).right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
