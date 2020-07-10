import cats._
import cats.data._
import cats.implicits._

1 === 1

//1 === "1" err

1 == "2"
(Some(1):Option[Int]) === (Some(2):Option[Int])


1 > 2.0
//1 compare 2.0  err type mismatch

1.0 compare 2.0

1.0 tryCompare Double.NaN

3.show

"hello".show


case class Person(name:String)
case class Car(model:String)

implicit val personShow = Show.show[Person](x=>s"person ${x.name}")

Person("Kuba").show

implicit val carShow = Show.fromToString[Car]

Car("honda").show