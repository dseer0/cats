package cats.kernel
package instances

trait AllInstances
    extends ArraySeqInstances
    with BigDecimalInstances
    with BigIntInstances
    with BitSetInstances
    with BooleanInstances
    with ByteInstances
    with CharInstances
    with DoubleInstances
    with EqInstances
    with EitherInstances
    with DurationInstances
    with FloatInstances
    with FunctionInstances
    with HashInstances
    with IntInstances
    with LazyListInstances
    with ListInstances
    with LongInstances
    with MapInstances
    with OptionInstances
    with OrderInstances
    with PartialOrderInstances
    with QueueInstances
    with SetInstances
    with SeqInstances
    with ShortInstances
    with StreamInstances
    with StringInstances
    with SymbolInstances
    with TupleInstances
    with UnitInstances
    with UUIDInstances
    with VectorInstances

private[instances] trait AllInstancesBinCompat0 extends FiniteDurationInstances

private[instances] trait AllInstancesBinCompat1 extends SortedMapInstances with SortedSetInstances

private[instances] trait AllInstancesBinCompat2 extends DeadlineInstances
