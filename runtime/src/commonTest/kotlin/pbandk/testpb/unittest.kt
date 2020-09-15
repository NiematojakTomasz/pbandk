@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

sealed class ForeignEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is ForeignEnum && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "ForeignEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

    object FOREIGN_FOO : ForeignEnum(4, "FOREIGN_FOO")
    object FOREIGN_BAR : ForeignEnum(5, "FOREIGN_BAR")
    object FOREIGN_BAZ : ForeignEnum(6, "FOREIGN_BAZ")
    class UNRECOGNIZED(value: Int) : ForeignEnum(value)

    companion object : pbandk.Message.Enum.Companion<ForeignEnum> {
        val values: List<ForeignEnum> by lazy { listOf(FOREIGN_FOO, FOREIGN_BAR, FOREIGN_BAZ) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No ForeignEnum with name: $name")
    }
}

sealed class TestEnumWithDupValue(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is TestEnumWithDupValue && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "TestEnumWithDupValue.${name ?: "UNRECOGNIZED"}(value=$value)"

    object FOO1 : TestEnumWithDupValue(1, "FOO1")
    object BAR1 : TestEnumWithDupValue(2, "BAR1")
    object BAZ : TestEnumWithDupValue(3, "BAZ")
    object FOO2 : TestEnumWithDupValue(1, "FOO2")
    object BAR2 : TestEnumWithDupValue(2, "BAR2")
    class UNRECOGNIZED(value: Int) : TestEnumWithDupValue(value)

    companion object : pbandk.Message.Enum.Companion<TestEnumWithDupValue> {
        val values: List<TestEnumWithDupValue> by lazy { listOf(FOO1, BAR1, BAZ, FOO2, BAR2) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No TestEnumWithDupValue with name: $name")
    }
}

sealed class TestSparseEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is TestSparseEnum && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "TestSparseEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

    object SPARSE_A : TestSparseEnum(123, "SPARSE_A")
    object SPARSE_B : TestSparseEnum(62374, "SPARSE_B")
    object SPARSE_C : TestSparseEnum(12589234, "SPARSE_C")
    object SPARSE_D : TestSparseEnum(-15, "SPARSE_D")
    object SPARSE_E : TestSparseEnum(-53452, "SPARSE_E")
    object SPARSE_F : TestSparseEnum(0, "SPARSE_F")
    object SPARSE_G : TestSparseEnum(2, "SPARSE_G")
    class UNRECOGNIZED(value: Int) : TestSparseEnum(value)

    companion object : pbandk.Message.Enum.Companion<TestSparseEnum> {
        val values: List<TestSparseEnum> by lazy { listOf(SPARSE_A, SPARSE_B, SPARSE_C, SPARSE_D, SPARSE_E, SPARSE_F, SPARSE_G) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No TestSparseEnum with name: $name")
    }
}

sealed class VeryLargeEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is VeryLargeEnum && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "VeryLargeEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

    object ENUM_LABEL_DEFAULT : VeryLargeEnum(0, "ENUM_LABEL_DEFAULT")
    object ENUM_LABEL_1 : VeryLargeEnum(1, "ENUM_LABEL_1")
    object ENUM_LABEL_2 : VeryLargeEnum(2, "ENUM_LABEL_2")
    object ENUM_LABEL_3 : VeryLargeEnum(3, "ENUM_LABEL_3")
    object ENUM_LABEL_4 : VeryLargeEnum(4, "ENUM_LABEL_4")
    object ENUM_LABEL_5 : VeryLargeEnum(5, "ENUM_LABEL_5")
    object ENUM_LABEL_6 : VeryLargeEnum(6, "ENUM_LABEL_6")
    object ENUM_LABEL_7 : VeryLargeEnum(7, "ENUM_LABEL_7")
    object ENUM_LABEL_8 : VeryLargeEnum(8, "ENUM_LABEL_8")
    object ENUM_LABEL_9 : VeryLargeEnum(9, "ENUM_LABEL_9")
    object ENUM_LABEL_10 : VeryLargeEnum(10, "ENUM_LABEL_10")
    object ENUM_LABEL_11 : VeryLargeEnum(11, "ENUM_LABEL_11")
    object ENUM_LABEL_12 : VeryLargeEnum(12, "ENUM_LABEL_12")
    object ENUM_LABEL_13 : VeryLargeEnum(13, "ENUM_LABEL_13")
    object ENUM_LABEL_14 : VeryLargeEnum(14, "ENUM_LABEL_14")
    object ENUM_LABEL_15 : VeryLargeEnum(15, "ENUM_LABEL_15")
    object ENUM_LABEL_16 : VeryLargeEnum(16, "ENUM_LABEL_16")
    object ENUM_LABEL_17 : VeryLargeEnum(17, "ENUM_LABEL_17")
    object ENUM_LABEL_18 : VeryLargeEnum(18, "ENUM_LABEL_18")
    object ENUM_LABEL_19 : VeryLargeEnum(19, "ENUM_LABEL_19")
    object ENUM_LABEL_20 : VeryLargeEnum(20, "ENUM_LABEL_20")
    object ENUM_LABEL_21 : VeryLargeEnum(21, "ENUM_LABEL_21")
    object ENUM_LABEL_22 : VeryLargeEnum(22, "ENUM_LABEL_22")
    object ENUM_LABEL_23 : VeryLargeEnum(23, "ENUM_LABEL_23")
    object ENUM_LABEL_24 : VeryLargeEnum(24, "ENUM_LABEL_24")
    object ENUM_LABEL_25 : VeryLargeEnum(25, "ENUM_LABEL_25")
    object ENUM_LABEL_26 : VeryLargeEnum(26, "ENUM_LABEL_26")
    object ENUM_LABEL_27 : VeryLargeEnum(27, "ENUM_LABEL_27")
    object ENUM_LABEL_28 : VeryLargeEnum(28, "ENUM_LABEL_28")
    object ENUM_LABEL_29 : VeryLargeEnum(29, "ENUM_LABEL_29")
    object ENUM_LABEL_30 : VeryLargeEnum(30, "ENUM_LABEL_30")
    object ENUM_LABEL_31 : VeryLargeEnum(31, "ENUM_LABEL_31")
    object ENUM_LABEL_32 : VeryLargeEnum(32, "ENUM_LABEL_32")
    object ENUM_LABEL_33 : VeryLargeEnum(33, "ENUM_LABEL_33")
    object ENUM_LABEL_34 : VeryLargeEnum(34, "ENUM_LABEL_34")
    object ENUM_LABEL_35 : VeryLargeEnum(35, "ENUM_LABEL_35")
    object ENUM_LABEL_36 : VeryLargeEnum(36, "ENUM_LABEL_36")
    object ENUM_LABEL_37 : VeryLargeEnum(37, "ENUM_LABEL_37")
    object ENUM_LABEL_38 : VeryLargeEnum(38, "ENUM_LABEL_38")
    object ENUM_LABEL_39 : VeryLargeEnum(39, "ENUM_LABEL_39")
    object ENUM_LABEL_40 : VeryLargeEnum(40, "ENUM_LABEL_40")
    object ENUM_LABEL_41 : VeryLargeEnum(41, "ENUM_LABEL_41")
    object ENUM_LABEL_42 : VeryLargeEnum(42, "ENUM_LABEL_42")
    object ENUM_LABEL_43 : VeryLargeEnum(43, "ENUM_LABEL_43")
    object ENUM_LABEL_44 : VeryLargeEnum(44, "ENUM_LABEL_44")
    object ENUM_LABEL_45 : VeryLargeEnum(45, "ENUM_LABEL_45")
    object ENUM_LABEL_46 : VeryLargeEnum(46, "ENUM_LABEL_46")
    object ENUM_LABEL_47 : VeryLargeEnum(47, "ENUM_LABEL_47")
    object ENUM_LABEL_48 : VeryLargeEnum(48, "ENUM_LABEL_48")
    object ENUM_LABEL_49 : VeryLargeEnum(49, "ENUM_LABEL_49")
    object ENUM_LABEL_50 : VeryLargeEnum(50, "ENUM_LABEL_50")
    object ENUM_LABEL_51 : VeryLargeEnum(51, "ENUM_LABEL_51")
    object ENUM_LABEL_52 : VeryLargeEnum(52, "ENUM_LABEL_52")
    object ENUM_LABEL_53 : VeryLargeEnum(53, "ENUM_LABEL_53")
    object ENUM_LABEL_54 : VeryLargeEnum(54, "ENUM_LABEL_54")
    object ENUM_LABEL_55 : VeryLargeEnum(55, "ENUM_LABEL_55")
    object ENUM_LABEL_56 : VeryLargeEnum(56, "ENUM_LABEL_56")
    object ENUM_LABEL_57 : VeryLargeEnum(57, "ENUM_LABEL_57")
    object ENUM_LABEL_58 : VeryLargeEnum(58, "ENUM_LABEL_58")
    object ENUM_LABEL_59 : VeryLargeEnum(59, "ENUM_LABEL_59")
    object ENUM_LABEL_60 : VeryLargeEnum(60, "ENUM_LABEL_60")
    object ENUM_LABEL_61 : VeryLargeEnum(61, "ENUM_LABEL_61")
    object ENUM_LABEL_62 : VeryLargeEnum(62, "ENUM_LABEL_62")
    object ENUM_LABEL_63 : VeryLargeEnum(63, "ENUM_LABEL_63")
    object ENUM_LABEL_64 : VeryLargeEnum(64, "ENUM_LABEL_64")
    object ENUM_LABEL_65 : VeryLargeEnum(65, "ENUM_LABEL_65")
    object ENUM_LABEL_66 : VeryLargeEnum(66, "ENUM_LABEL_66")
    object ENUM_LABEL_67 : VeryLargeEnum(67, "ENUM_LABEL_67")
    object ENUM_LABEL_68 : VeryLargeEnum(68, "ENUM_LABEL_68")
    object ENUM_LABEL_69 : VeryLargeEnum(69, "ENUM_LABEL_69")
    object ENUM_LABEL_70 : VeryLargeEnum(70, "ENUM_LABEL_70")
    object ENUM_LABEL_71 : VeryLargeEnum(71, "ENUM_LABEL_71")
    object ENUM_LABEL_72 : VeryLargeEnum(72, "ENUM_LABEL_72")
    object ENUM_LABEL_73 : VeryLargeEnum(73, "ENUM_LABEL_73")
    object ENUM_LABEL_74 : VeryLargeEnum(74, "ENUM_LABEL_74")
    object ENUM_LABEL_75 : VeryLargeEnum(75, "ENUM_LABEL_75")
    object ENUM_LABEL_76 : VeryLargeEnum(76, "ENUM_LABEL_76")
    object ENUM_LABEL_77 : VeryLargeEnum(77, "ENUM_LABEL_77")
    object ENUM_LABEL_78 : VeryLargeEnum(78, "ENUM_LABEL_78")
    object ENUM_LABEL_79 : VeryLargeEnum(79, "ENUM_LABEL_79")
    object ENUM_LABEL_80 : VeryLargeEnum(80, "ENUM_LABEL_80")
    object ENUM_LABEL_81 : VeryLargeEnum(81, "ENUM_LABEL_81")
    object ENUM_LABEL_82 : VeryLargeEnum(82, "ENUM_LABEL_82")
    object ENUM_LABEL_83 : VeryLargeEnum(83, "ENUM_LABEL_83")
    object ENUM_LABEL_84 : VeryLargeEnum(84, "ENUM_LABEL_84")
    object ENUM_LABEL_85 : VeryLargeEnum(85, "ENUM_LABEL_85")
    object ENUM_LABEL_86 : VeryLargeEnum(86, "ENUM_LABEL_86")
    object ENUM_LABEL_87 : VeryLargeEnum(87, "ENUM_LABEL_87")
    object ENUM_LABEL_88 : VeryLargeEnum(88, "ENUM_LABEL_88")
    object ENUM_LABEL_89 : VeryLargeEnum(89, "ENUM_LABEL_89")
    object ENUM_LABEL_90 : VeryLargeEnum(90, "ENUM_LABEL_90")
    object ENUM_LABEL_91 : VeryLargeEnum(91, "ENUM_LABEL_91")
    object ENUM_LABEL_92 : VeryLargeEnum(92, "ENUM_LABEL_92")
    object ENUM_LABEL_93 : VeryLargeEnum(93, "ENUM_LABEL_93")
    object ENUM_LABEL_94 : VeryLargeEnum(94, "ENUM_LABEL_94")
    object ENUM_LABEL_95 : VeryLargeEnum(95, "ENUM_LABEL_95")
    object ENUM_LABEL_96 : VeryLargeEnum(96, "ENUM_LABEL_96")
    object ENUM_LABEL_97 : VeryLargeEnum(97, "ENUM_LABEL_97")
    object ENUM_LABEL_98 : VeryLargeEnum(98, "ENUM_LABEL_98")
    object ENUM_LABEL_99 : VeryLargeEnum(99, "ENUM_LABEL_99")
    object ENUM_LABEL_100 : VeryLargeEnum(100, "ENUM_LABEL_100")
    class UNRECOGNIZED(value: Int) : VeryLargeEnum(value)

    companion object : pbandk.Message.Enum.Companion<VeryLargeEnum> {
        val values: List<VeryLargeEnum> by lazy { listOf(ENUM_LABEL_DEFAULT, ENUM_LABEL_1, ENUM_LABEL_2, ENUM_LABEL_3, ENUM_LABEL_4, ENUM_LABEL_5, ENUM_LABEL_6, ENUM_LABEL_7, ENUM_LABEL_8, ENUM_LABEL_9, ENUM_LABEL_10, ENUM_LABEL_11, ENUM_LABEL_12, ENUM_LABEL_13, ENUM_LABEL_14, ENUM_LABEL_15, ENUM_LABEL_16, ENUM_LABEL_17, ENUM_LABEL_18, ENUM_LABEL_19, ENUM_LABEL_20, ENUM_LABEL_21, ENUM_LABEL_22, ENUM_LABEL_23, ENUM_LABEL_24, ENUM_LABEL_25, ENUM_LABEL_26, ENUM_LABEL_27, ENUM_LABEL_28, ENUM_LABEL_29, ENUM_LABEL_30, ENUM_LABEL_31, ENUM_LABEL_32, ENUM_LABEL_33, ENUM_LABEL_34, ENUM_LABEL_35, ENUM_LABEL_36, ENUM_LABEL_37, ENUM_LABEL_38, ENUM_LABEL_39, ENUM_LABEL_40, ENUM_LABEL_41, ENUM_LABEL_42, ENUM_LABEL_43, ENUM_LABEL_44, ENUM_LABEL_45, ENUM_LABEL_46, ENUM_LABEL_47, ENUM_LABEL_48, ENUM_LABEL_49, ENUM_LABEL_50, ENUM_LABEL_51, ENUM_LABEL_52, ENUM_LABEL_53, ENUM_LABEL_54, ENUM_LABEL_55, ENUM_LABEL_56, ENUM_LABEL_57, ENUM_LABEL_58, ENUM_LABEL_59, ENUM_LABEL_60, ENUM_LABEL_61, ENUM_LABEL_62, ENUM_LABEL_63, ENUM_LABEL_64, ENUM_LABEL_65, ENUM_LABEL_66, ENUM_LABEL_67, ENUM_LABEL_68, ENUM_LABEL_69, ENUM_LABEL_70, ENUM_LABEL_71, ENUM_LABEL_72, ENUM_LABEL_73, ENUM_LABEL_74, ENUM_LABEL_75, ENUM_LABEL_76, ENUM_LABEL_77, ENUM_LABEL_78, ENUM_LABEL_79, ENUM_LABEL_80, ENUM_LABEL_81, ENUM_LABEL_82, ENUM_LABEL_83, ENUM_LABEL_84, ENUM_LABEL_85, ENUM_LABEL_86, ENUM_LABEL_87, ENUM_LABEL_88, ENUM_LABEL_89, ENUM_LABEL_90, ENUM_LABEL_91, ENUM_LABEL_92, ENUM_LABEL_93, ENUM_LABEL_94, ENUM_LABEL_95, ENUM_LABEL_96, ENUM_LABEL_97, ENUM_LABEL_98, ENUM_LABEL_99, ENUM_LABEL_100) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No VeryLargeEnum with name: $name")
    }
}

data class TestAllTypes(
    val optionalInt32: Int? = null,
    val optionalInt64: Long? = null,
    val optionalUint32: Int? = null,
    val optionalUint64: Long? = null,
    val optionalSint32: Int? = null,
    val optionalSint64: Long? = null,
    val optionalFixed32: Int? = null,
    val optionalFixed64: Long? = null,
    val optionalSfixed32: Int? = null,
    val optionalSfixed64: Long? = null,
    val optionalFloat: Float? = null,
    val optionalDouble: Double? = null,
    val optionalBool: Boolean? = null,
    val optionalString: String? = null,
    val optionalBytes: pbandk.ByteArr? = null,
    val optionalNestedMessage: pbandk.testpb.TestAllTypes.NestedMessage? = null,
    val optionalForeignMessage: pbandk.testpb.ForeignMessage? = null,
    val optionalImportMessage: pbandk.testpb.ImportMessage? = null,
    val optionalNestedEnum: pbandk.testpb.TestAllTypes.NestedEnum? = null,
    val optionalForeignEnum: pbandk.testpb.ForeignEnum? = null,
    val optionalImportEnum: pbandk.testpb.ImportEnum? = null,
    val optionalStringPiece: String? = null,
    val optionalCord: String? = null,
    val optionalPublicImportMessage: pbandk.testpb.PublicImportMessage? = null,
    val optionalLazyMessage: pbandk.testpb.TestAllTypes.NestedMessage? = null,
    val repeatedInt32: List<Int> = emptyList(),
    val repeatedInt64: List<Long> = emptyList(),
    val repeatedUint32: List<Int> = emptyList(),
    val repeatedUint64: List<Long> = emptyList(),
    val repeatedSint32: List<Int> = emptyList(),
    val repeatedSint64: List<Long> = emptyList(),
    val repeatedFixed32: List<Int> = emptyList(),
    val repeatedFixed64: List<Long> = emptyList(),
    val repeatedSfixed32: List<Int> = emptyList(),
    val repeatedSfixed64: List<Long> = emptyList(),
    val repeatedFloat: List<Float> = emptyList(),
    val repeatedDouble: List<Double> = emptyList(),
    val repeatedBool: List<Boolean> = emptyList(),
    val repeatedString: List<String> = emptyList(),
    val repeatedBytes: List<pbandk.ByteArr> = emptyList(),
    val repeatedNestedMessage: List<pbandk.testpb.TestAllTypes.NestedMessage> = emptyList(),
    val repeatedForeignMessage: List<pbandk.testpb.ForeignMessage> = emptyList(),
    val repeatedImportMessage: List<pbandk.testpb.ImportMessage> = emptyList(),
    val repeatedNestedEnum: List<pbandk.testpb.TestAllTypes.NestedEnum> = emptyList(),
    val repeatedForeignEnum: List<pbandk.testpb.ForeignEnum> = emptyList(),
    val repeatedImportEnum: List<pbandk.testpb.ImportEnum> = emptyList(),
    val repeatedStringPiece: List<String> = emptyList(),
    val repeatedCord: List<String> = emptyList(),
    val repeatedLazyMessage: List<pbandk.testpb.TestAllTypes.NestedMessage> = emptyList(),
    val defaultInt32: Int? = null,
    val defaultInt64: Long? = null,
    val defaultUint32: Int? = null,
    val defaultUint64: Long? = null,
    val defaultSint32: Int? = null,
    val defaultSint64: Long? = null,
    val defaultFixed32: Int? = null,
    val defaultFixed64: Long? = null,
    val defaultSfixed32: Int? = null,
    val defaultSfixed64: Long? = null,
    val defaultFloat: Float? = null,
    val defaultDouble: Double? = null,
    val defaultBool: Boolean? = null,
    val defaultString: String? = null,
    val defaultBytes: pbandk.ByteArr? = null,
    val defaultNestedEnum: pbandk.testpb.TestAllTypes.NestedEnum? = null,
    val defaultForeignEnum: pbandk.testpb.ForeignEnum? = null,
    val defaultImportEnum: pbandk.testpb.ImportEnum? = null,
    val defaultStringPiece: String? = null,
    val defaultCord: String? = null,
    val oneofField: OneofField<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    sealed class OneofField<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class OneofUint32(oneofUint32: Int? = null) : OneofField<Int?>(oneofUint32)
        class OneofNestedMessage(oneofNestedMessage: pbandk.testpb.TestAllTypes.NestedMessage?) : OneofField<pbandk.testpb.TestAllTypes.NestedMessage?>(oneofNestedMessage)
        class OneofString(oneofString: String? = null) : OneofField<String?>(oneofString)
        class OneofBytes(oneofBytes: pbandk.ByteArr? = null) : OneofField<pbandk.ByteArr?>(oneofBytes)
    }

    val oneofUint32: Int??
        get() = (oneofField as? OneofField.OneofUint32)?.value
    val oneofNestedMessage: pbandk.testpb.TestAllTypes.NestedMessage??
        get() = (oneofField as? OneofField.OneofNestedMessage)?.value
    val oneofString: String??
        get() = (oneofField as? OneofField.OneofString)?.value
    val oneofBytes: pbandk.ByteArr??
        get() = (oneofField as? OneofField.OneofBytes)?.value

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestAllTypes> {
        val defaultInstance by lazy { TestAllTypes() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypes.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestAllTypes> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestAllTypes::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_int32",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "optionalInt32",
                        value = TestAllTypes::optionalInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_int64",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "optionalInt64",
                        value = TestAllTypes::optionalInt64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_uint32",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "optionalUint32",
                        value = TestAllTypes::optionalUint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_uint64",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "optionalUint64",
                        value = TestAllTypes::optionalUint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_sint32",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                        jsonName = "optionalSint32",
                        value = TestAllTypes::optionalSint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_sint64",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                        jsonName = "optionalSint64",
                        value = TestAllTypes::optionalSint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_fixed32",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                        jsonName = "optionalFixed32",
                        value = TestAllTypes::optionalFixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_fixed64",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                        jsonName = "optionalFixed64",
                        value = TestAllTypes::optionalFixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_sfixed32",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                        jsonName = "optionalSfixed32",
                        value = TestAllTypes::optionalSfixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_sfixed64",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                        jsonName = "optionalSfixed64",
                        value = TestAllTypes::optionalSfixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_float",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "optionalFloat",
                        value = TestAllTypes::optionalFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_double",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "optionalDouble",
                        value = TestAllTypes::optionalDouble
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_bool",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "optionalBool",
                        value = TestAllTypes::optionalBool
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_string",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "optionalString",
                        value = TestAllTypes::optionalString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_bytes",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "optionalBytes",
                        value = TestAllTypes::optionalBytes
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_nested_message",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.NestedMessage.Companion),
                        jsonName = "optionalNestedMessage",
                        value = TestAllTypes::optionalNestedMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_foreign_message",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ForeignMessage.Companion),
                        jsonName = "optionalForeignMessage",
                        value = TestAllTypes::optionalForeignMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_import_message",
                        number = 20,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ImportMessage.Companion),
                        jsonName = "optionalImportMessage",
                        value = TestAllTypes::optionalImportMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_nested_enum",
                        number = 21,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypes.NestedEnum.Companion, hasPresence = true),
                        jsonName = "optionalNestedEnum",
                        value = TestAllTypes::optionalNestedEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_foreign_enum",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion, hasPresence = true),
                        jsonName = "optionalForeignEnum",
                        value = TestAllTypes::optionalForeignEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_import_enum",
                        number = 23,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ImportEnum.Companion, hasPresence = true),
                        jsonName = "optionalImportEnum",
                        value = TestAllTypes::optionalImportEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_string_piece",
                        number = 24,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "optionalStringPiece",
                        value = TestAllTypes::optionalStringPiece
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_cord",
                        number = 25,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "optionalCord",
                        value = TestAllTypes::optionalCord
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_public_import_message",
                        number = 26,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.PublicImportMessage.Companion),
                        jsonName = "optionalPublicImportMessage",
                        value = TestAllTypes::optionalPublicImportMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_lazy_message",
                        number = 27,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.NestedMessage.Companion),
                        jsonName = "optionalLazyMessage",
                        value = TestAllTypes::optionalLazyMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_int32",
                        number = 31,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true)),
                        jsonName = "repeatedInt32",
                        value = TestAllTypes::repeatedInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_int64",
                        number = 32,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true)),
                        jsonName = "repeatedInt64",
                        value = TestAllTypes::repeatedInt64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_uint32",
                        number = 33,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true)),
                        jsonName = "repeatedUint32",
                        value = TestAllTypes::repeatedUint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_uint64",
                        number = 34,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true)),
                        jsonName = "repeatedUint64",
                        value = TestAllTypes::repeatedUint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_sint32",
                        number = 35,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true)),
                        jsonName = "repeatedSint32",
                        value = TestAllTypes::repeatedSint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_sint64",
                        number = 36,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true)),
                        jsonName = "repeatedSint64",
                        value = TestAllTypes::repeatedSint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_fixed32",
                        number = 37,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true)),
                        jsonName = "repeatedFixed32",
                        value = TestAllTypes::repeatedFixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_fixed64",
                        number = 38,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true)),
                        jsonName = "repeatedFixed64",
                        value = TestAllTypes::repeatedFixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_sfixed32",
                        number = 39,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true)),
                        jsonName = "repeatedSfixed32",
                        value = TestAllTypes::repeatedSfixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_sfixed64",
                        number = 40,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true)),
                        jsonName = "repeatedSfixed64",
                        value = TestAllTypes::repeatedSfixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_float",
                        number = 41,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true)),
                        jsonName = "repeatedFloat",
                        value = TestAllTypes::repeatedFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_double",
                        number = 42,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true)),
                        jsonName = "repeatedDouble",
                        value = TestAllTypes::repeatedDouble
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_bool",
                        number = 43,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true)),
                        jsonName = "repeatedBool",
                        value = TestAllTypes::repeatedBool
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_string",
                        number = 44,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true)),
                        jsonName = "repeatedString",
                        value = TestAllTypes::repeatedString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_bytes",
                        number = 45,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true)),
                        jsonName = "repeatedBytes",
                        value = TestAllTypes::repeatedBytes
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_nested_message",
                        number = 48,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestAllTypes.NestedMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.NestedMessage.Companion)),
                        jsonName = "repeatedNestedMessage",
                        value = TestAllTypes::repeatedNestedMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_foreign_message",
                        number = 49,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.ForeignMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ForeignMessage.Companion)),
                        jsonName = "repeatedForeignMessage",
                        value = TestAllTypes::repeatedForeignMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_import_message",
                        number = 50,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.ImportMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ImportMessage.Companion)),
                        jsonName = "repeatedImportMessage",
                        value = TestAllTypes::repeatedImportMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_nested_enum",
                        number = 51,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestAllTypes.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypes.NestedEnum.Companion, hasPresence = true)),
                        jsonName = "repeatedNestedEnum",
                        value = TestAllTypes::repeatedNestedEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_foreign_enum",
                        number = 52,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.ForeignEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion, hasPresence = true)),
                        jsonName = "repeatedForeignEnum",
                        value = TestAllTypes::repeatedForeignEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_import_enum",
                        number = 53,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.ImportEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ImportEnum.Companion, hasPresence = true)),
                        jsonName = "repeatedImportEnum",
                        value = TestAllTypes::repeatedImportEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_string_piece",
                        number = 54,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true)),
                        jsonName = "repeatedStringPiece",
                        value = TestAllTypes::repeatedStringPiece
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_cord",
                        number = 55,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true)),
                        jsonName = "repeatedCord",
                        value = TestAllTypes::repeatedCord
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_lazy_message",
                        number = 57,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestAllTypes.NestedMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.NestedMessage.Companion)),
                        jsonName = "repeatedLazyMessage",
                        value = TestAllTypes::repeatedLazyMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_int32",
                        number = 61,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "defaultInt32",
                        value = TestAllTypes::defaultInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_int64",
                        number = 62,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "defaultInt64",
                        value = TestAllTypes::defaultInt64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_uint32",
                        number = 63,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "defaultUint32",
                        value = TestAllTypes::defaultUint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_uint64",
                        number = 64,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "defaultUint64",
                        value = TestAllTypes::defaultUint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_sint32",
                        number = 65,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                        jsonName = "defaultSint32",
                        value = TestAllTypes::defaultSint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_sint64",
                        number = 66,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                        jsonName = "defaultSint64",
                        value = TestAllTypes::defaultSint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_fixed32",
                        number = 67,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                        jsonName = "defaultFixed32",
                        value = TestAllTypes::defaultFixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_fixed64",
                        number = 68,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                        jsonName = "defaultFixed64",
                        value = TestAllTypes::defaultFixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_sfixed32",
                        number = 69,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                        jsonName = "defaultSfixed32",
                        value = TestAllTypes::defaultSfixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_sfixed64",
                        number = 70,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                        jsonName = "defaultSfixed64",
                        value = TestAllTypes::defaultSfixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_float",
                        number = 71,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "defaultFloat",
                        value = TestAllTypes::defaultFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_double",
                        number = 72,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "defaultDouble",
                        value = TestAllTypes::defaultDouble
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_bool",
                        number = 73,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "defaultBool",
                        value = TestAllTypes::defaultBool
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_string",
                        number = 74,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "defaultString",
                        value = TestAllTypes::defaultString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_bytes",
                        number = 75,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "defaultBytes",
                        value = TestAllTypes::defaultBytes
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_nested_enum",
                        number = 81,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypes.NestedEnum.Companion, hasPresence = true),
                        jsonName = "defaultNestedEnum",
                        value = TestAllTypes::defaultNestedEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_foreign_enum",
                        number = 82,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion, hasPresence = true),
                        jsonName = "defaultForeignEnum",
                        value = TestAllTypes::defaultForeignEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_import_enum",
                        number = 83,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ImportEnum.Companion, hasPresence = true),
                        jsonName = "defaultImportEnum",
                        value = TestAllTypes::defaultImportEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_string_piece",
                        number = 84,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "defaultStringPiece",
                        value = TestAllTypes::defaultStringPiece
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "default_cord",
                        number = 85,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "defaultCord",
                        value = TestAllTypes::defaultCord
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_uint32",
                        number = 111,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofUint32",
                        value = TestAllTypes::oneofUint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_nested_message",
                        number = 112,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.NestedMessage.Companion),
                        oneofMember = true,
                        jsonName = "oneofNestedMessage",
                        value = TestAllTypes::oneofNestedMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_string",
                        number = 113,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofString",
                        value = TestAllTypes::oneofString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_bytes",
                        number = 114,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofBytes",
                        value = TestAllTypes::oneofBytes
                    )
                )
            )
        }
    }

    sealed class NestedEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is TestAllTypes.NestedEnum && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "TestAllTypes.NestedEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

        object FOO : NestedEnum(1, "FOO")
        object BAR : NestedEnum(2, "BAR")
        object BAZ : NestedEnum(3, "BAZ")
        object NEG : NestedEnum(-1, "NEG")
        class UNRECOGNIZED(value: Int) : TestAllTypes.NestedEnum(value)

        companion object : pbandk.Message.Enum.Companion<TestAllTypes.NestedEnum> {
            val values: List<TestAllTypes.NestedEnum> by lazy { listOf(FOO, BAR, BAZ, NEG) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No NestedEnum with name: $name")
        }
    }

    data class NestedMessage(
        val bb: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypes.NestedMessage> {
            val defaultInstance by lazy { TestAllTypes.NestedMessage() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypes.NestedMessage.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypes.NestedMessage> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypes.NestedMessage::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "bb",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "bb",
                            value = TestAllTypes.NestedMessage::bb
                        )
                    )
                )
            }
        }
    }

    data class OptionalGroup(
        val a: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypes.OptionalGroup> {
            val defaultInstance by lazy { TestAllTypes.OptionalGroup() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypes.OptionalGroup.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypes.OptionalGroup> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypes.OptionalGroup::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "a",
                            number = 17,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "a",
                            value = TestAllTypes.OptionalGroup::a
                        )
                    )
                )
            }
        }
    }

    data class RepeatedGroup(
        val a: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestAllTypes.RepeatedGroup> {
            val defaultInstance by lazy { TestAllTypes.RepeatedGroup() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestAllTypes.RepeatedGroup.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestAllTypes.RepeatedGroup> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestAllTypes.RepeatedGroup::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "a",
                            number = 47,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "a",
                            value = TestAllTypes.RepeatedGroup::a
                        )
                    )
                )
            }
        }
    }
}

data class NestedTestAllTypes(
    val child: pbandk.testpb.NestedTestAllTypes? = null,
    val payload: pbandk.testpb.TestAllTypes? = null,
    val repeatedChild: List<pbandk.testpb.NestedTestAllTypes> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<NestedTestAllTypes> {
        val defaultInstance by lazy { NestedTestAllTypes() }
        override fun decodeWith(u: pbandk.MessageDecoder) = NestedTestAllTypes.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<NestedTestAllTypes> by lazy {
            pbandk.MessageDescriptor(
                messageClass = NestedTestAllTypes::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "child",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.NestedTestAllTypes.Companion),
                        jsonName = "child",
                        value = NestedTestAllTypes::child
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "payload",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion),
                        jsonName = "payload",
                        value = NestedTestAllTypes::payload
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_child",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.NestedTestAllTypes>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.NestedTestAllTypes.Companion)),
                        jsonName = "repeatedChild",
                        value = NestedTestAllTypes::repeatedChild
                    )
                )
            )
        }
    }
}

data class TestDeprecatedFields(
    val deprecatedInt32: Int? = null,
    val oneofFields: OneofFields<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    sealed class OneofFields<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class DeprecatedInt32InOneof(deprecatedInt32InOneof: Int? = null) : OneofFields<Int?>(deprecatedInt32InOneof)
    }

    val deprecatedInt32InOneof: Int??
        get() = (oneofFields as? OneofFields.DeprecatedInt32InOneof)?.value

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestDeprecatedFields> {
        val defaultInstance by lazy { TestDeprecatedFields() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestDeprecatedFields.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestDeprecatedFields> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestDeprecatedFields::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "deprecated_int32",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "deprecatedInt32",
                        value = TestDeprecatedFields::deprecatedInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "deprecated_int32_in_oneof",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "deprecatedInt32InOneof",
                        value = TestDeprecatedFields::deprecatedInt32InOneof
                    )
                )
            )
        }
    }
}

data class TestDeprecatedMessage(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestDeprecatedMessage> {
        val defaultInstance by lazy { TestDeprecatedMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestDeprecatedMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestDeprecatedMessage> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestDeprecatedMessage::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

data class ForeignMessage(
    val c: Int? = null,
    val d: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<ForeignMessage> {
        val defaultInstance by lazy { ForeignMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder) = ForeignMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ForeignMessage> by lazy {
            pbandk.MessageDescriptor(
                messageClass = ForeignMessage::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "c",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "c",
                        value = ForeignMessage::c
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "d",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "d",
                        value = ForeignMessage::d
                    )
                )
            )
        }
    }
}

data class TestReservedFields(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestReservedFields> {
        val defaultInstance by lazy { TestReservedFields() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestReservedFields.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestReservedFields> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestReservedFields::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

data class TestAllExtensions(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestAllExtensions> {
        val defaultInstance by lazy { TestAllExtensions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestAllExtensions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestAllExtensions> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestAllExtensions::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

data class OptionalGroupExtension(
    val a: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<OptionalGroupExtension> {
        val defaultInstance by lazy { OptionalGroupExtension() }
        override fun decodeWith(u: pbandk.MessageDecoder) = OptionalGroupExtension.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<OptionalGroupExtension> by lazy {
            pbandk.MessageDescriptor(
                messageClass = OptionalGroupExtension::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "a",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "a",
                        value = OptionalGroupExtension::a
                    )
                )
            )
        }
    }
}

data class RepeatedGroupExtension(
    val a: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<RepeatedGroupExtension> {
        val defaultInstance by lazy { RepeatedGroupExtension() }
        override fun decodeWith(u: pbandk.MessageDecoder) = RepeatedGroupExtension.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<RepeatedGroupExtension> by lazy {
            pbandk.MessageDescriptor(
                messageClass = RepeatedGroupExtension::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "a",
                        number = 47,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "a",
                        value = RepeatedGroupExtension::a
                    )
                )
            )
        }
    }
}

data class TestGroup(
    val optionalForeignEnum: pbandk.testpb.ForeignEnum? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestGroup> {
        val defaultInstance by lazy { TestGroup() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestGroup.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestGroup> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestGroup::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_foreign_enum",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion, hasPresence = true),
                        jsonName = "optionalForeignEnum",
                        value = TestGroup::optionalForeignEnum
                    )
                )
            )
        }
    }

    data class OptionalGroup(
        val a: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestGroup.OptionalGroup> {
            val defaultInstance by lazy { TestGroup.OptionalGroup() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestGroup.OptionalGroup.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestGroup.OptionalGroup> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestGroup.OptionalGroup::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "a",
                            number = 17,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "a",
                            value = TestGroup.OptionalGroup::a
                        )
                    )
                )
            }
        }
    }
}

data class TestGroupExtension(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestGroupExtension> {
        val defaultInstance by lazy { TestGroupExtension() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestGroupExtension.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestGroupExtension> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestGroupExtension::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

data class TestNestedExtension(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestNestedExtension> {
        val defaultInstance by lazy { TestNestedExtension() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestNestedExtension.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestNestedExtension> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestNestedExtension::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }

    data class OptionalGroupExtension(
        val a: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestNestedExtension.OptionalGroupExtension> {
            val defaultInstance by lazy { TestNestedExtension.OptionalGroupExtension() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestNestedExtension.OptionalGroupExtension.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestNestedExtension.OptionalGroupExtension> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestNestedExtension.OptionalGroupExtension::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "a",
                            number = 17,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "a",
                            value = TestNestedExtension.OptionalGroupExtension::a
                        )
                    )
                )
            }
        }
    }
}

data class TestRequired(
    val a: Int = 0,
    val dummy2: Int? = null,
    val b: Int = 0,
    val dummy4: Int? = null,
    val dummy5: Int? = null,
    val dummy6: Int? = null,
    val dummy7: Int? = null,
    val dummy8: Int? = null,
    val dummy9: Int? = null,
    val dummy10: Int? = null,
    val dummy11: Int? = null,
    val dummy12: Int? = null,
    val dummy13: Int? = null,
    val dummy14: Int? = null,
    val dummy15: Int? = null,
    val dummy16: Int? = null,
    val dummy17: Int? = null,
    val dummy18: Int? = null,
    val dummy19: Int? = null,
    val dummy20: Int? = null,
    val dummy21: Int? = null,
    val dummy22: Int? = null,
    val dummy23: Int? = null,
    val dummy24: Int? = null,
    val dummy25: Int? = null,
    val dummy26: Int? = null,
    val dummy27: Int? = null,
    val dummy28: Int? = null,
    val dummy29: Int? = null,
    val dummy30: Int? = null,
    val dummy31: Int? = null,
    val dummy32: Int? = null,
    val c: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestRequired> {
        val defaultInstance by lazy { TestRequired() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestRequired.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestRequired> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestRequired::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "a",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "a",
                        value = TestRequired::a
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy2",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy2",
                        value = TestRequired::dummy2
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "b",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "b",
                        value = TestRequired::b
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy4",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy4",
                        value = TestRequired::dummy4
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy5",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy5",
                        value = TestRequired::dummy5
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy6",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy6",
                        value = TestRequired::dummy6
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy7",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy7",
                        value = TestRequired::dummy7
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy8",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy8",
                        value = TestRequired::dummy8
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy9",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy9",
                        value = TestRequired::dummy9
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy10",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy10",
                        value = TestRequired::dummy10
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy11",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy11",
                        value = TestRequired::dummy11
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy12",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy12",
                        value = TestRequired::dummy12
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy13",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy13",
                        value = TestRequired::dummy13
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy14",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy14",
                        value = TestRequired::dummy14
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy15",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy15",
                        value = TestRequired::dummy15
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy16",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy16",
                        value = TestRequired::dummy16
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy17",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy17",
                        value = TestRequired::dummy17
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy18",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy18",
                        value = TestRequired::dummy18
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy19",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy19",
                        value = TestRequired::dummy19
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy20",
                        number = 20,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy20",
                        value = TestRequired::dummy20
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy21",
                        number = 21,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy21",
                        value = TestRequired::dummy21
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy22",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy22",
                        value = TestRequired::dummy22
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy23",
                        number = 23,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy23",
                        value = TestRequired::dummy23
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy24",
                        number = 24,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy24",
                        value = TestRequired::dummy24
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy25",
                        number = 25,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy25",
                        value = TestRequired::dummy25
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy26",
                        number = 26,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy26",
                        value = TestRequired::dummy26
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy27",
                        number = 27,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy27",
                        value = TestRequired::dummy27
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy28",
                        number = 28,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy28",
                        value = TestRequired::dummy28
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy29",
                        number = 29,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy29",
                        value = TestRequired::dummy29
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy30",
                        number = 30,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy30",
                        value = TestRequired::dummy30
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy31",
                        number = 31,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy31",
                        value = TestRequired::dummy31
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy32",
                        number = 32,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy32",
                        value = TestRequired::dummy32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "c",
                        number = 33,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "c",
                        value = TestRequired::c
                    )
                )
            )
        }
    }
}

data class TestRequiredForeign(
    val optionalMessage: pbandk.testpb.TestRequired? = null,
    val repeatedMessage: List<pbandk.testpb.TestRequired> = emptyList(),
    val dummy: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestRequiredForeign> {
        val defaultInstance by lazy { TestRequiredForeign() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestRequiredForeign.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestRequiredForeign> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestRequiredForeign::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestRequired.Companion),
                        jsonName = "optionalMessage",
                        value = TestRequiredForeign::optionalMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_message",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestRequired>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestRequired.Companion)),
                        jsonName = "repeatedMessage",
                        value = TestRequiredForeign::repeatedMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dummy",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "dummy",
                        value = TestRequiredForeign::dummy
                    )
                )
            )
        }
    }
}

data class TestRequiredMessage(
    val optionalMessage: pbandk.testpb.TestRequired? = null,
    val repeatedMessage: List<pbandk.testpb.TestRequired> = emptyList(),
    val requiredMessage: pbandk.testpb.TestRequired? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestRequiredMessage> {
        val defaultInstance by lazy { TestRequiredMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestRequiredMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestRequiredMessage> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestRequiredMessage::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestRequired.Companion),
                        jsonName = "optionalMessage",
                        value = TestRequiredMessage::optionalMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_message",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestRequired>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestRequired.Companion)),
                        jsonName = "repeatedMessage",
                        value = TestRequiredMessage::repeatedMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "required_message",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestRequired.Companion),
                        jsonName = "requiredMessage",
                        value = TestRequiredMessage::requiredMessage
                    )
                )
            )
        }
    }
}

data class TestForeignNested(
    val foreignNested: pbandk.testpb.TestAllTypes.NestedMessage? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestForeignNested> {
        val defaultInstance by lazy { TestForeignNested() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestForeignNested.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestForeignNested> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestForeignNested::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foreign_nested",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.NestedMessage.Companion),
                        jsonName = "foreignNested",
                        value = TestForeignNested::foreignNested
                    )
                )
            )
        }
    }
}

data class TestEmptyMessage(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestEmptyMessage> {
        val defaultInstance by lazy { TestEmptyMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestEmptyMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestEmptyMessage> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestEmptyMessage::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

data class TestEmptyMessageWithExtensions(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestEmptyMessageWithExtensions> {
        val defaultInstance by lazy { TestEmptyMessageWithExtensions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestEmptyMessageWithExtensions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestEmptyMessageWithExtensions> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestEmptyMessageWithExtensions::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

data class TestMultipleExtensionRanges(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestMultipleExtensionRanges> {
        val defaultInstance by lazy { TestMultipleExtensionRanges() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestMultipleExtensionRanges.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestMultipleExtensionRanges> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestMultipleExtensionRanges::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

data class TestReallyLargeTagNumber(
    val a: Int? = null,
    val bb: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestReallyLargeTagNumber> {
        val defaultInstance by lazy { TestReallyLargeTagNumber() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestReallyLargeTagNumber.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestReallyLargeTagNumber> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestReallyLargeTagNumber::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "a",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "a",
                        value = TestReallyLargeTagNumber::a
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "bb",
                        number = 268435455,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "bb",
                        value = TestReallyLargeTagNumber::bb
                    )
                )
            )
        }
    }
}

data class TestRecursiveMessage(
    val a: pbandk.testpb.TestRecursiveMessage? = null,
    val i: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestRecursiveMessage> {
        val defaultInstance by lazy { TestRecursiveMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestRecursiveMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestRecursiveMessage> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestRecursiveMessage::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "a",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestRecursiveMessage.Companion),
                        jsonName = "a",
                        value = TestRecursiveMessage::a
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "i",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "i",
                        value = TestRecursiveMessage::i
                    )
                )
            )
        }
    }
}

data class TestMutualRecursionA(
    val bb: pbandk.testpb.TestMutualRecursionB? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestMutualRecursionA> {
        val defaultInstance by lazy { TestMutualRecursionA() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestMutualRecursionA.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestMutualRecursionA> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestMutualRecursionA::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "bb",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestMutualRecursionB.Companion),
                        jsonName = "bb",
                        value = TestMutualRecursionA::bb
                    )
                )
            )
        }
    }

    data class SubMessage(
        val b: pbandk.testpb.TestMutualRecursionB? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestMutualRecursionA.SubMessage> {
            val defaultInstance by lazy { TestMutualRecursionA.SubMessage() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestMutualRecursionA.SubMessage.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestMutualRecursionA.SubMessage> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestMutualRecursionA.SubMessage::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "b",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestMutualRecursionB.Companion),
                            jsonName = "b",
                            value = TestMutualRecursionA.SubMessage::b
                        )
                    )
                )
            }
        }
    }

    data class SubGroup(
        val subMessage: pbandk.testpb.TestMutualRecursionA.SubMessage? = null,
        val notInThisScc: pbandk.testpb.TestAllTypes? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestMutualRecursionA.SubGroup> {
            val defaultInstance by lazy { TestMutualRecursionA.SubGroup() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestMutualRecursionA.SubGroup.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestMutualRecursionA.SubGroup> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestMutualRecursionA.SubGroup::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "sub_message",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestMutualRecursionA.SubMessage.Companion),
                            jsonName = "subMessage",
                            value = TestMutualRecursionA.SubGroup::subMessage
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "not_in_this_scc",
                            number = 4,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion),
                            jsonName = "notInThisScc",
                            value = TestMutualRecursionA.SubGroup::notInThisScc
                        )
                    )
                )
            }
        }
    }
}

data class TestMutualRecursionB(
    val a: pbandk.testpb.TestMutualRecursionA? = null,
    val optionalInt32: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestMutualRecursionB> {
        val defaultInstance by lazy { TestMutualRecursionB() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestMutualRecursionB.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestMutualRecursionB> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestMutualRecursionB::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "a",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestMutualRecursionA.Companion),
                        jsonName = "a",
                        value = TestMutualRecursionB::a
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_int32",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "optionalInt32",
                        value = TestMutualRecursionB::optionalInt32
                    )
                )
            )
        }
    }
}

data class TestIsInitialized(
    val subMessage: pbandk.testpb.TestIsInitialized.SubMessage? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestIsInitialized> {
        val defaultInstance by lazy { TestIsInitialized() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestIsInitialized.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestIsInitialized> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestIsInitialized::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "sub_message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestIsInitialized.SubMessage.Companion),
                        jsonName = "subMessage",
                        value = TestIsInitialized::subMessage
                    )
                )
            )
        }
    }

    data class SubMessage(
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestIsInitialized.SubMessage> {
            val defaultInstance by lazy { TestIsInitialized.SubMessage() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestIsInitialized.SubMessage.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestIsInitialized.SubMessage> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestIsInitialized.SubMessage::class,
                    messageCompanion = this,
                    fields = listOf(
                    )
                )
            }
        }

        data class SubGroup(
            val i: Int = 0,
            override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ) : pbandk.Message {
            override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
            override val descriptor get() = Companion.descriptor
            override val protoSize by lazy { super.protoSize }
            companion object : pbandk.Message.Companion<TestIsInitialized.SubMessage.SubGroup> {
                val defaultInstance by lazy { TestIsInitialized.SubMessage.SubGroup() }
                override fun decodeWith(u: pbandk.MessageDecoder) = TestIsInitialized.SubMessage.SubGroup.decodeWithImpl(u)

                override val descriptor: pbandk.MessageDescriptor<TestIsInitialized.SubMessage.SubGroup> by lazy {
                    pbandk.MessageDescriptor(
                        messageClass = TestIsInitialized.SubMessage.SubGroup::class,
                        messageCompanion = this,
                        fields = listOf(
                            pbandk.FieldDescriptor(
                                messageDescriptor = this::descriptor,
                                name = "i",
                                number = 2,
                                type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                                jsonName = "i",
                                value = TestIsInitialized.SubMessage.SubGroup::i
                            )
                        )
                    )
                }
            }
        }
    }
}

data class TestDupFieldNumber(
    val a: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestDupFieldNumber> {
        val defaultInstance by lazy { TestDupFieldNumber() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestDupFieldNumber.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestDupFieldNumber> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestDupFieldNumber::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "a",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "a",
                        value = TestDupFieldNumber::a
                    )
                )
            )
        }
    }

    data class Foo(
        val a: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestDupFieldNumber.Foo> {
            val defaultInstance by lazy { TestDupFieldNumber.Foo() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestDupFieldNumber.Foo.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestDupFieldNumber.Foo> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestDupFieldNumber.Foo::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "a",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "a",
                            value = TestDupFieldNumber.Foo::a
                        )
                    )
                )
            }
        }
    }

    data class Bar(
        val a: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestDupFieldNumber.Bar> {
            val defaultInstance by lazy { TestDupFieldNumber.Bar() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestDupFieldNumber.Bar.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestDupFieldNumber.Bar> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestDupFieldNumber.Bar::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "a",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "a",
                            value = TestDupFieldNumber.Bar::a
                        )
                    )
                )
            }
        }
    }
}

data class TestEagerMessage(
    val subMessage: pbandk.testpb.TestAllTypes? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestEagerMessage> {
        val defaultInstance by lazy { TestEagerMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestEagerMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestEagerMessage> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestEagerMessage::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "sub_message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion),
                        jsonName = "subMessage",
                        value = TestEagerMessage::subMessage
                    )
                )
            )
        }
    }
}

data class TestLazyMessage(
    val subMessage: pbandk.testpb.TestAllTypes? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestLazyMessage> {
        val defaultInstance by lazy { TestLazyMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestLazyMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestLazyMessage> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestLazyMessage::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "sub_message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion),
                        jsonName = "subMessage",
                        value = TestLazyMessage::subMessage
                    )
                )
            )
        }
    }
}

data class TestNestedMessageHasBits(
    val optionalNestedMessage: pbandk.testpb.TestNestedMessageHasBits.NestedMessage? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestNestedMessageHasBits> {
        val defaultInstance by lazy { TestNestedMessageHasBits() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestNestedMessageHasBits.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestNestedMessageHasBits> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestNestedMessageHasBits::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_nested_message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestNestedMessageHasBits.NestedMessage.Companion),
                        jsonName = "optionalNestedMessage",
                        value = TestNestedMessageHasBits::optionalNestedMessage
                    )
                )
            )
        }
    }

    data class NestedMessage(
        val nestedmessageRepeatedInt32: List<Int> = emptyList(),
        val nestedmessageRepeatedForeignmessage: List<pbandk.testpb.ForeignMessage> = emptyList(),
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestNestedMessageHasBits.NestedMessage> {
            val defaultInstance by lazy { TestNestedMessageHasBits.NestedMessage() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestNestedMessageHasBits.NestedMessage.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestNestedMessageHasBits.NestedMessage> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestNestedMessageHasBits.NestedMessage::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "nestedmessage_repeated_int32",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true)),
                            jsonName = "nestedmessageRepeatedInt32",
                            value = TestNestedMessageHasBits.NestedMessage::nestedmessageRepeatedInt32
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "nestedmessage_repeated_foreignmessage",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.ForeignMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ForeignMessage.Companion)),
                            jsonName = "nestedmessageRepeatedForeignmessage",
                            value = TestNestedMessageHasBits.NestedMessage::nestedmessageRepeatedForeignmessage
                        )
                    )
                )
            }
        }
    }
}

data class TestCamelCaseFieldNames(
    val primitiveField: Int? = null,
    val stringField: String? = null,
    val enumField: pbandk.testpb.ForeignEnum? = null,
    val messageField: pbandk.testpb.ForeignMessage? = null,
    val stringPieceField: String? = null,
    val cordField: String? = null,
    val repeatedPrimitiveField: List<Int> = emptyList(),
    val repeatedStringField: List<String> = emptyList(),
    val repeatedEnumField: List<pbandk.testpb.ForeignEnum> = emptyList(),
    val repeatedMessageField: List<pbandk.testpb.ForeignMessage> = emptyList(),
    val repeatedStringPieceField: List<String> = emptyList(),
    val repeatedCordField: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestCamelCaseFieldNames> {
        val defaultInstance by lazy { TestCamelCaseFieldNames() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestCamelCaseFieldNames.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestCamelCaseFieldNames> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestCamelCaseFieldNames::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "PrimitiveField",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "PrimitiveField",
                        value = TestCamelCaseFieldNames::primitiveField
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "StringField",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "StringField",
                        value = TestCamelCaseFieldNames::stringField
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "EnumField",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion, hasPresence = true),
                        jsonName = "EnumField",
                        value = TestCamelCaseFieldNames::enumField
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "MessageField",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ForeignMessage.Companion),
                        jsonName = "MessageField",
                        value = TestCamelCaseFieldNames::messageField
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "StringPieceField",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "StringPieceField",
                        value = TestCamelCaseFieldNames::stringPieceField
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "CordField",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "CordField",
                        value = TestCamelCaseFieldNames::cordField
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "RepeatedPrimitiveField",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true)),
                        jsonName = "RepeatedPrimitiveField",
                        value = TestCamelCaseFieldNames::repeatedPrimitiveField
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "RepeatedStringField",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true)),
                        jsonName = "RepeatedStringField",
                        value = TestCamelCaseFieldNames::repeatedStringField
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "RepeatedEnumField",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.ForeignEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion, hasPresence = true)),
                        jsonName = "RepeatedEnumField",
                        value = TestCamelCaseFieldNames::repeatedEnumField
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "RepeatedMessageField",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.ForeignMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ForeignMessage.Companion)),
                        jsonName = "RepeatedMessageField",
                        value = TestCamelCaseFieldNames::repeatedMessageField
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "RepeatedStringPieceField",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true)),
                        jsonName = "RepeatedStringPieceField",
                        value = TestCamelCaseFieldNames::repeatedStringPieceField
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "RepeatedCordField",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true)),
                        jsonName = "RepeatedCordField",
                        value = TestCamelCaseFieldNames::repeatedCordField
                    )
                )
            )
        }
    }
}

data class TestFieldOrderings(
    val myString: String? = null,
    val myInt: Long? = null,
    val myFloat: Float? = null,
    val optionalNestedMessage: pbandk.testpb.TestFieldOrderings.NestedMessage? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestFieldOrderings> {
        val defaultInstance by lazy { TestFieldOrderings() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestFieldOrderings.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestFieldOrderings> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestFieldOrderings::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "my_int",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "myInt",
                        value = TestFieldOrderings::myInt
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "my_string",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "myString",
                        value = TestFieldOrderings::myString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "my_float",
                        number = 101,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "myFloat",
                        value = TestFieldOrderings::myFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_nested_message",
                        number = 200,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestFieldOrderings.NestedMessage.Companion),
                        jsonName = "optionalNestedMessage",
                        value = TestFieldOrderings::optionalNestedMessage
                    )
                )
            )
        }
    }

    data class NestedMessage(
        val oo: Long? = null,
        val bb: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestFieldOrderings.NestedMessage> {
            val defaultInstance by lazy { TestFieldOrderings.NestedMessage() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestFieldOrderings.NestedMessage.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestFieldOrderings.NestedMessage> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestFieldOrderings.NestedMessage::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "bb",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "bb",
                            value = TestFieldOrderings.NestedMessage::bb
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "oo",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                            jsonName = "oo",
                            value = TestFieldOrderings.NestedMessage::oo
                        )
                    )
                )
            }
        }
    }
}

data class TestExtensionOrderings1(
    val myString: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestExtensionOrderings1> {
        val defaultInstance by lazy { TestExtensionOrderings1() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestExtensionOrderings1.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestExtensionOrderings1> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestExtensionOrderings1::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "my_string",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "myString",
                        value = TestExtensionOrderings1::myString
                    )
                )
            )
        }
    }
}

data class TestExtensionOrderings2(
    val myString: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestExtensionOrderings2> {
        val defaultInstance by lazy { TestExtensionOrderings2() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestExtensionOrderings2.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestExtensionOrderings2> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestExtensionOrderings2::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "my_string",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "myString",
                        value = TestExtensionOrderings2::myString
                    )
                )
            )
        }
    }

    data class TestExtensionOrderings3(
        val myString: String? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestExtensionOrderings2.TestExtensionOrderings3> {
            val defaultInstance by lazy { TestExtensionOrderings2.TestExtensionOrderings3() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestExtensionOrderings2.TestExtensionOrderings3.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestExtensionOrderings2.TestExtensionOrderings3> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestExtensionOrderings2.TestExtensionOrderings3::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "my_string",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "myString",
                            value = TestExtensionOrderings2.TestExtensionOrderings3::myString
                        )
                    )
                )
            }
        }
    }
}

data class TestExtremeDefaultValues(
    val escapedBytes: pbandk.ByteArr? = null,
    val largeUint32: Int? = null,
    val largeUint64: Long? = null,
    val smallInt32: Int? = null,
    val smallInt64: Long? = null,
    val reallySmallInt32: Int? = null,
    val reallySmallInt64: Long? = null,
    val utf8String: String? = null,
    val zeroFloat: Float? = null,
    val oneFloat: Float? = null,
    val smallFloat: Float? = null,
    val negativeOneFloat: Float? = null,
    val negativeFloat: Float? = null,
    val largeFloat: Float? = null,
    val smallNegativeFloat: Float? = null,
    val infDouble: Double? = null,
    val negInfDouble: Double? = null,
    val nanDouble: Double? = null,
    val infFloat: Float? = null,
    val negInfFloat: Float? = null,
    val nanFloat: Float? = null,
    val cppTrigraph: String? = null,
    val stringWithZero: String? = null,
    val bytesWithZero: pbandk.ByteArr? = null,
    val stringPieceWithZero: String? = null,
    val cordWithZero: String? = null,
    val replacementString: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestExtremeDefaultValues> {
        val defaultInstance by lazy { TestExtremeDefaultValues() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestExtremeDefaultValues.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestExtremeDefaultValues> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestExtremeDefaultValues::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "escaped_bytes",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "escapedBytes",
                        value = TestExtremeDefaultValues::escapedBytes
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "large_uint32",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "largeUint32",
                        value = TestExtremeDefaultValues::largeUint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "large_uint64",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "largeUint64",
                        value = TestExtremeDefaultValues::largeUint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "small_int32",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "smallInt32",
                        value = TestExtremeDefaultValues::smallInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "small_int64",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "smallInt64",
                        value = TestExtremeDefaultValues::smallInt64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "utf8_string",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "utf8String",
                        value = TestExtremeDefaultValues::utf8String
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "zero_float",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "zeroFloat",
                        value = TestExtremeDefaultValues::zeroFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "one_float",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "oneFloat",
                        value = TestExtremeDefaultValues::oneFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "small_float",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "smallFloat",
                        value = TestExtremeDefaultValues::smallFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "negative_one_float",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "negativeOneFloat",
                        value = TestExtremeDefaultValues::negativeOneFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "negative_float",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "negativeFloat",
                        value = TestExtremeDefaultValues::negativeFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "large_float",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "largeFloat",
                        value = TestExtremeDefaultValues::largeFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "small_negative_float",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "smallNegativeFloat",
                        value = TestExtremeDefaultValues::smallNegativeFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "inf_double",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "infDouble",
                        value = TestExtremeDefaultValues::infDouble
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "neg_inf_double",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "negInfDouble",
                        value = TestExtremeDefaultValues::negInfDouble
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "nan_double",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "nanDouble",
                        value = TestExtremeDefaultValues::nanDouble
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "inf_float",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "infFloat",
                        value = TestExtremeDefaultValues::infFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "neg_inf_float",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "negInfFloat",
                        value = TestExtremeDefaultValues::negInfFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "nan_float",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "nanFloat",
                        value = TestExtremeDefaultValues::nanFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "cpp_trigraph",
                        number = 20,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "cppTrigraph",
                        value = TestExtremeDefaultValues::cppTrigraph
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "really_small_int32",
                        number = 21,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "reallySmallInt32",
                        value = TestExtremeDefaultValues::reallySmallInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "really_small_int64",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "reallySmallInt64",
                        value = TestExtremeDefaultValues::reallySmallInt64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "string_with_zero",
                        number = 23,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "stringWithZero",
                        value = TestExtremeDefaultValues::stringWithZero
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "bytes_with_zero",
                        number = 24,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "bytesWithZero",
                        value = TestExtremeDefaultValues::bytesWithZero
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "string_piece_with_zero",
                        number = 25,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "stringPieceWithZero",
                        value = TestExtremeDefaultValues::stringPieceWithZero
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "cord_with_zero",
                        number = 26,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "cordWithZero",
                        value = TestExtremeDefaultValues::cordWithZero
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "replacement_string",
                        number = 27,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "replacementString",
                        value = TestExtremeDefaultValues::replacementString
                    )
                )
            )
        }
    }
}

data class SparseEnumMessage(
    val sparseEnum: pbandk.testpb.TestSparseEnum? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<SparseEnumMessage> {
        val defaultInstance by lazy { SparseEnumMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder) = SparseEnumMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<SparseEnumMessage> by lazy {
            pbandk.MessageDescriptor(
                messageClass = SparseEnumMessage::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "sparse_enum",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestSparseEnum.Companion, hasPresence = true),
                        jsonName = "sparseEnum",
                        value = SparseEnumMessage::sparseEnum
                    )
                )
            )
        }
    }
}

data class OneString(
    val data: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<OneString> {
        val defaultInstance by lazy { OneString() }
        override fun decodeWith(u: pbandk.MessageDecoder) = OneString.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<OneString> by lazy {
            pbandk.MessageDescriptor(
                messageClass = OneString::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "data",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "data",
                        value = OneString::data
                    )
                )
            )
        }
    }
}

data class MoreString(
    val data: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<MoreString> {
        val defaultInstance by lazy { MoreString() }
        override fun decodeWith(u: pbandk.MessageDecoder) = MoreString.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<MoreString> by lazy {
            pbandk.MessageDescriptor(
                messageClass = MoreString::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "data",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true)),
                        jsonName = "data",
                        value = MoreString::data
                    )
                )
            )
        }
    }
}

data class OneBytes(
    val data: pbandk.ByteArr? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<OneBytes> {
        val defaultInstance by lazy { OneBytes() }
        override fun decodeWith(u: pbandk.MessageDecoder) = OneBytes.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<OneBytes> by lazy {
            pbandk.MessageDescriptor(
                messageClass = OneBytes::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "data",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "data",
                        value = OneBytes::data
                    )
                )
            )
        }
    }
}

data class MoreBytes(
    val data: List<pbandk.ByteArr> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<MoreBytes> {
        val defaultInstance by lazy { MoreBytes() }
        override fun decodeWith(u: pbandk.MessageDecoder) = MoreBytes.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<MoreBytes> by lazy {
            pbandk.MessageDescriptor(
                messageClass = MoreBytes::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "data",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true)),
                        jsonName = "data",
                        value = MoreBytes::data
                    )
                )
            )
        }
    }
}

data class Int32Message(
    val data: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Int32Message> {
        val defaultInstance by lazy { Int32Message() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Int32Message.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Int32Message> by lazy {
            pbandk.MessageDescriptor(
                messageClass = Int32Message::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "data",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "data",
                        value = Int32Message::data
                    )
                )
            )
        }
    }
}

data class Uint32Message(
    val data: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Uint32Message> {
        val defaultInstance by lazy { Uint32Message() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Uint32Message.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Uint32Message> by lazy {
            pbandk.MessageDescriptor(
                messageClass = Uint32Message::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "data",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "data",
                        value = Uint32Message::data
                    )
                )
            )
        }
    }
}

data class Int64Message(
    val data: Long? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Int64Message> {
        val defaultInstance by lazy { Int64Message() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Int64Message.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Int64Message> by lazy {
            pbandk.MessageDescriptor(
                messageClass = Int64Message::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "data",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "data",
                        value = Int64Message::data
                    )
                )
            )
        }
    }
}

data class Uint64Message(
    val data: Long? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<Uint64Message> {
        val defaultInstance by lazy { Uint64Message() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Uint64Message.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Uint64Message> by lazy {
            pbandk.MessageDescriptor(
                messageClass = Uint64Message::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "data",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "data",
                        value = Uint64Message::data
                    )
                )
            )
        }
    }
}

data class BoolMessage(
    val data: Boolean? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<BoolMessage> {
        val defaultInstance by lazy { BoolMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder) = BoolMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<BoolMessage> by lazy {
            pbandk.MessageDescriptor(
                messageClass = BoolMessage::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "data",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "data",
                        value = BoolMessage::data
                    )
                )
            )
        }
    }
}

data class TestOneof(
    val foo: Foo<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    sealed class Foo<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class FooInt(fooInt: Int? = null) : Foo<Int?>(fooInt)
        class FooString(fooString: String? = null) : Foo<String?>(fooString)
        class FooMessage(fooMessage: pbandk.testpb.TestAllTypes?) : Foo<pbandk.testpb.TestAllTypes?>(fooMessage)
    }

    val fooInt: Int??
        get() = (foo as? Foo.FooInt)?.value
    val fooString: String??
        get() = (foo as? Foo.FooString)?.value
    val fooMessage: pbandk.testpb.TestAllTypes??
        get() = (foo as? Foo.FooMessage)?.value

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestOneof> {
        val defaultInstance by lazy { TestOneof() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestOneof.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestOneof> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestOneof::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_int",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "fooInt",
                        value = TestOneof::fooInt
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_string",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "fooString",
                        value = TestOneof::fooString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_message",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion),
                        oneofMember = true,
                        jsonName = "fooMessage",
                        value = TestOneof::fooMessage
                    )
                )
            )
        }
    }

    data class FooGroup(
        val a: Int? = null,
        val b: String? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestOneof.FooGroup> {
            val defaultInstance by lazy { TestOneof.FooGroup() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestOneof.FooGroup.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestOneof.FooGroup> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestOneof.FooGroup::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "a",
                            number = 5,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "a",
                            value = TestOneof.FooGroup::a
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "b",
                            number = 6,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "b",
                            value = TestOneof.FooGroup::b
                        )
                    )
                )
            }
        }
    }
}

data class TestOneofBackwardsCompatible(
    val fooInt: Int? = null,
    val fooString: String? = null,
    val fooMessage: pbandk.testpb.TestAllTypes? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestOneofBackwardsCompatible> {
        val defaultInstance by lazy { TestOneofBackwardsCompatible() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestOneofBackwardsCompatible.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestOneofBackwardsCompatible> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestOneofBackwardsCompatible::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_int",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fooInt",
                        value = TestOneofBackwardsCompatible::fooInt
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_string",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "fooString",
                        value = TestOneofBackwardsCompatible::fooString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_message",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion),
                        jsonName = "fooMessage",
                        value = TestOneofBackwardsCompatible::fooMessage
                    )
                )
            )
        }
    }

    data class FooGroup(
        val a: Int? = null,
        val b: String? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestOneofBackwardsCompatible.FooGroup> {
            val defaultInstance by lazy { TestOneofBackwardsCompatible.FooGroup() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestOneofBackwardsCompatible.FooGroup.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestOneofBackwardsCompatible.FooGroup> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestOneofBackwardsCompatible.FooGroup::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "a",
                            number = 5,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "a",
                            value = TestOneofBackwardsCompatible.FooGroup::a
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "b",
                            number = 6,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "b",
                            value = TestOneofBackwardsCompatible.FooGroup::b
                        )
                    )
                )
            }
        }
    }
}

data class TestOneof2(
    val bazInt: Int? = null,
    val bazString: String? = null,
    val foo: Foo<*>? = null,
    val bar: Bar<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    sealed class Foo<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class FooInt(fooInt: Int? = null) : Foo<Int?>(fooInt)
        class FooString(fooString: String? = null) : Foo<String?>(fooString)
        class FooCord(fooCord: String? = null) : Foo<String?>(fooCord)
        class FooStringPiece(fooStringPiece: String? = null) : Foo<String?>(fooStringPiece)
        class FooBytes(fooBytes: pbandk.ByteArr? = null) : Foo<pbandk.ByteArr?>(fooBytes)
        class FooEnum(fooEnum: pbandk.testpb.TestOneof2.NestedEnum? = null) : Foo<pbandk.testpb.TestOneof2.NestedEnum?>(fooEnum)
        class FooMessage(fooMessage: pbandk.testpb.TestOneof2.NestedMessage?) : Foo<pbandk.testpb.TestOneof2.NestedMessage?>(fooMessage)
        class FooLazyMessage(fooLazyMessage: pbandk.testpb.TestOneof2.NestedMessage?) : Foo<pbandk.testpb.TestOneof2.NestedMessage?>(fooLazyMessage)
    }

    val fooInt: Int??
        get() = (foo as? Foo.FooInt)?.value
    val fooString: String??
        get() = (foo as? Foo.FooString)?.value
    val fooCord: String??
        get() = (foo as? Foo.FooCord)?.value
    val fooStringPiece: String??
        get() = (foo as? Foo.FooStringPiece)?.value
    val fooBytes: pbandk.ByteArr??
        get() = (foo as? Foo.FooBytes)?.value
    val fooEnum: pbandk.testpb.TestOneof2.NestedEnum??
        get() = (foo as? Foo.FooEnum)?.value
    val fooMessage: pbandk.testpb.TestOneof2.NestedMessage??
        get() = (foo as? Foo.FooMessage)?.value
    val fooLazyMessage: pbandk.testpb.TestOneof2.NestedMessage??
        get() = (foo as? Foo.FooLazyMessage)?.value

    sealed class Bar<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class BarInt(barInt: Int? = null) : Bar<Int?>(barInt)
        class BarString(barString: String? = null) : Bar<String?>(barString)
        class BarCord(barCord: String? = null) : Bar<String?>(barCord)
        class BarStringPiece(barStringPiece: String? = null) : Bar<String?>(barStringPiece)
        class BarBytes(barBytes: pbandk.ByteArr? = null) : Bar<pbandk.ByteArr?>(barBytes)
        class BarEnum(barEnum: pbandk.testpb.TestOneof2.NestedEnum? = null) : Bar<pbandk.testpb.TestOneof2.NestedEnum?>(barEnum)
    }

    val barInt: Int??
        get() = (bar as? Bar.BarInt)?.value
    val barString: String??
        get() = (bar as? Bar.BarString)?.value
    val barCord: String??
        get() = (bar as? Bar.BarCord)?.value
    val barStringPiece: String??
        get() = (bar as? Bar.BarStringPiece)?.value
    val barBytes: pbandk.ByteArr??
        get() = (bar as? Bar.BarBytes)?.value
    val barEnum: pbandk.testpb.TestOneof2.NestedEnum??
        get() = (bar as? Bar.BarEnum)?.value

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestOneof2> {
        val defaultInstance by lazy { TestOneof2() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestOneof2.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestOneof2> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestOneof2::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_int",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "fooInt",
                        value = TestOneof2::fooInt
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_string",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "fooString",
                        value = TestOneof2::fooString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_cord",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "fooCord",
                        value = TestOneof2::fooCord
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_string_piece",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "fooStringPiece",
                        value = TestOneof2::fooStringPiece
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_bytes",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        oneofMember = true,
                        jsonName = "fooBytes",
                        value = TestOneof2::fooBytes
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_enum",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestOneof2.NestedEnum.Companion, hasPresence = true),
                        oneofMember = true,
                        jsonName = "fooEnum",
                        value = TestOneof2::fooEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_message",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestOneof2.NestedMessage.Companion),
                        oneofMember = true,
                        jsonName = "fooMessage",
                        value = TestOneof2::fooMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_lazy_message",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestOneof2.NestedMessage.Companion),
                        oneofMember = true,
                        jsonName = "fooLazyMessage",
                        value = TestOneof2::fooLazyMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "bar_int",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "barInt",
                        value = TestOneof2::barInt
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "bar_string",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "barString",
                        value = TestOneof2::barString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "bar_cord",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "barCord",
                        value = TestOneof2::barCord
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "bar_string_piece",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "barStringPiece",
                        value = TestOneof2::barStringPiece
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "bar_bytes",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        oneofMember = true,
                        jsonName = "barBytes",
                        value = TestOneof2::barBytes
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "bar_enum",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestOneof2.NestedEnum.Companion, hasPresence = true),
                        oneofMember = true,
                        jsonName = "barEnum",
                        value = TestOneof2::barEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "baz_int",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "bazInt",
                        value = TestOneof2::bazInt
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "baz_string",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "bazString",
                        value = TestOneof2::bazString
                    )
                )
            )
        }
    }

    sealed class NestedEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is TestOneof2.NestedEnum && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "TestOneof2.NestedEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

        object FOO : NestedEnum(1, "FOO")
        object BAR : NestedEnum(2, "BAR")
        object BAZ : NestedEnum(3, "BAZ")
        class UNRECOGNIZED(value: Int) : TestOneof2.NestedEnum(value)

        companion object : pbandk.Message.Enum.Companion<TestOneof2.NestedEnum> {
            val values: List<TestOneof2.NestedEnum> by lazy { listOf(FOO, BAR, BAZ) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No NestedEnum with name: $name")
        }
    }

    data class FooGroup(
        val a: Int? = null,
        val b: String? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestOneof2.FooGroup> {
            val defaultInstance by lazy { TestOneof2.FooGroup() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestOneof2.FooGroup.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestOneof2.FooGroup> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestOneof2.FooGroup::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "a",
                            number = 9,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "a",
                            value = TestOneof2.FooGroup::a
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "b",
                            number = 10,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "b",
                            value = TestOneof2.FooGroup::b
                        )
                    )
                )
            }
        }
    }

    data class NestedMessage(
        val quxInt: Long? = null,
        val corgeInt: List<Int> = emptyList(),
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestOneof2.NestedMessage> {
            val defaultInstance by lazy { TestOneof2.NestedMessage() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestOneof2.NestedMessage.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestOneof2.NestedMessage> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestOneof2.NestedMessage::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "qux_int",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                            jsonName = "quxInt",
                            value = TestOneof2.NestedMessage::quxInt
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "corge_int",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true)),
                            jsonName = "corgeInt",
                            value = TestOneof2.NestedMessage::corgeInt
                        )
                    )
                )
            }
        }
    }
}

data class TestRequiredOneof(
    val foo: Foo<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    sealed class Foo<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class FooInt(fooInt: Int? = null) : Foo<Int?>(fooInt)
        class FooString(fooString: String? = null) : Foo<String?>(fooString)
        class FooMessage(fooMessage: pbandk.testpb.TestRequiredOneof.NestedMessage?) : Foo<pbandk.testpb.TestRequiredOneof.NestedMessage?>(fooMessage)
    }

    val fooInt: Int??
        get() = (foo as? Foo.FooInt)?.value
    val fooString: String??
        get() = (foo as? Foo.FooString)?.value
    val fooMessage: pbandk.testpb.TestRequiredOneof.NestedMessage??
        get() = (foo as? Foo.FooMessage)?.value

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestRequiredOneof> {
        val defaultInstance by lazy { TestRequiredOneof() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestRequiredOneof.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestRequiredOneof> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestRequiredOneof::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_int",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "fooInt",
                        value = TestRequiredOneof::fooInt
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_string",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "fooString",
                        value = TestRequiredOneof::fooString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "foo_message",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestRequiredOneof.NestedMessage.Companion),
                        oneofMember = true,
                        jsonName = "fooMessage",
                        value = TestRequiredOneof::fooMessage
                    )
                )
            )
        }
    }

    data class NestedMessage(
        val requiredDouble: Double = 0.0,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestRequiredOneof.NestedMessage> {
            val defaultInstance by lazy { TestRequiredOneof.NestedMessage() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestRequiredOneof.NestedMessage.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestRequiredOneof.NestedMessage> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestRequiredOneof.NestedMessage::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "required_double",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                            jsonName = "requiredDouble",
                            value = TestRequiredOneof.NestedMessage::requiredDouble
                        )
                    )
                )
            }
        }
    }
}

data class TestPackedTypes(
    val packedInt32: List<Int> = emptyList(),
    val packedInt64: List<Long> = emptyList(),
    val packedUint32: List<Int> = emptyList(),
    val packedUint64: List<Long> = emptyList(),
    val packedSint32: List<Int> = emptyList(),
    val packedSint64: List<Long> = emptyList(),
    val packedFixed32: List<Int> = emptyList(),
    val packedFixed64: List<Long> = emptyList(),
    val packedSfixed32: List<Int> = emptyList(),
    val packedSfixed64: List<Long> = emptyList(),
    val packedFloat: List<Float> = emptyList(),
    val packedDouble: List<Double> = emptyList(),
    val packedBool: List<Boolean> = emptyList(),
    val packedEnum: List<pbandk.testpb.ForeignEnum> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestPackedTypes> {
        val defaultInstance by lazy { TestPackedTypes() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestPackedTypes.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestPackedTypes> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestPackedTypes::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_int32",
                        number = 90,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true), packed = true),
                        jsonName = "packedInt32",
                        value = TestPackedTypes::packedInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_int64",
                        number = 91,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true), packed = true),
                        jsonName = "packedInt64",
                        value = TestPackedTypes::packedInt64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_uint32",
                        number = 92,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true), packed = true),
                        jsonName = "packedUint32",
                        value = TestPackedTypes::packedUint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_uint64",
                        number = 93,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true), packed = true),
                        jsonName = "packedUint64",
                        value = TestPackedTypes::packedUint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_sint32",
                        number = 94,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true), packed = true),
                        jsonName = "packedSint32",
                        value = TestPackedTypes::packedSint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_sint64",
                        number = 95,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true), packed = true),
                        jsonName = "packedSint64",
                        value = TestPackedTypes::packedSint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_fixed32",
                        number = 96,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true), packed = true),
                        jsonName = "packedFixed32",
                        value = TestPackedTypes::packedFixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_fixed64",
                        number = 97,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true), packed = true),
                        jsonName = "packedFixed64",
                        value = TestPackedTypes::packedFixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_sfixed32",
                        number = 98,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true), packed = true),
                        jsonName = "packedSfixed32",
                        value = TestPackedTypes::packedSfixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_sfixed64",
                        number = 99,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true), packed = true),
                        jsonName = "packedSfixed64",
                        value = TestPackedTypes::packedSfixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_float",
                        number = 100,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true), packed = true),
                        jsonName = "packedFloat",
                        value = TestPackedTypes::packedFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_double",
                        number = 101,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true), packed = true),
                        jsonName = "packedDouble",
                        value = TestPackedTypes::packedDouble
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_bool",
                        number = 102,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true), packed = true),
                        jsonName = "packedBool",
                        value = TestPackedTypes::packedBool
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_enum",
                        number = 103,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.ForeignEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion, hasPresence = true), packed = true),
                        jsonName = "packedEnum",
                        value = TestPackedTypes::packedEnum
                    )
                )
            )
        }
    }
}

data class TestUnpackedTypes(
    val unpackedInt32: List<Int> = emptyList(),
    val unpackedInt64: List<Long> = emptyList(),
    val unpackedUint32: List<Int> = emptyList(),
    val unpackedUint64: List<Long> = emptyList(),
    val unpackedSint32: List<Int> = emptyList(),
    val unpackedSint64: List<Long> = emptyList(),
    val unpackedFixed32: List<Int> = emptyList(),
    val unpackedFixed64: List<Long> = emptyList(),
    val unpackedSfixed32: List<Int> = emptyList(),
    val unpackedSfixed64: List<Long> = emptyList(),
    val unpackedFloat: List<Float> = emptyList(),
    val unpackedDouble: List<Double> = emptyList(),
    val unpackedBool: List<Boolean> = emptyList(),
    val unpackedEnum: List<pbandk.testpb.ForeignEnum> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestUnpackedTypes> {
        val defaultInstance by lazy { TestUnpackedTypes() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestUnpackedTypes.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestUnpackedTypes> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestUnpackedTypes::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_int32",
                        number = 90,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true)),
                        jsonName = "unpackedInt32",
                        value = TestUnpackedTypes::unpackedInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_int64",
                        number = 91,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true)),
                        jsonName = "unpackedInt64",
                        value = TestUnpackedTypes::unpackedInt64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_uint32",
                        number = 92,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true)),
                        jsonName = "unpackedUint32",
                        value = TestUnpackedTypes::unpackedUint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_uint64",
                        number = 93,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true)),
                        jsonName = "unpackedUint64",
                        value = TestUnpackedTypes::unpackedUint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_sint32",
                        number = 94,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true)),
                        jsonName = "unpackedSint32",
                        value = TestUnpackedTypes::unpackedSint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_sint64",
                        number = 95,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true)),
                        jsonName = "unpackedSint64",
                        value = TestUnpackedTypes::unpackedSint64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_fixed32",
                        number = 96,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true)),
                        jsonName = "unpackedFixed32",
                        value = TestUnpackedTypes::unpackedFixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_fixed64",
                        number = 97,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true)),
                        jsonName = "unpackedFixed64",
                        value = TestUnpackedTypes::unpackedFixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_sfixed32",
                        number = 98,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true)),
                        jsonName = "unpackedSfixed32",
                        value = TestUnpackedTypes::unpackedSfixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_sfixed64",
                        number = 99,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true)),
                        jsonName = "unpackedSfixed64",
                        value = TestUnpackedTypes::unpackedSfixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_float",
                        number = 100,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true)),
                        jsonName = "unpackedFloat",
                        value = TestUnpackedTypes::unpackedFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_double",
                        number = 101,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true)),
                        jsonName = "unpackedDouble",
                        value = TestUnpackedTypes::unpackedDouble
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_bool",
                        number = 102,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true)),
                        jsonName = "unpackedBool",
                        value = TestUnpackedTypes::unpackedBool
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "unpacked_enum",
                        number = 103,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.ForeignEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion, hasPresence = true)),
                        jsonName = "unpackedEnum",
                        value = TestUnpackedTypes::unpackedEnum
                    )
                )
            )
        }
    }
}

data class TestPackedExtensions(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestPackedExtensions> {
        val defaultInstance by lazy { TestPackedExtensions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestPackedExtensions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestPackedExtensions> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestPackedExtensions::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

data class TestUnpackedExtensions(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestUnpackedExtensions> {
        val defaultInstance by lazy { TestUnpackedExtensions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestUnpackedExtensions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestUnpackedExtensions> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestUnpackedExtensions::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

data class TestDynamicExtensions(
    val scalarExtension: Int? = null,
    val enumExtension: pbandk.testpb.ForeignEnum? = null,
    val dynamicEnumExtension: pbandk.testpb.TestDynamicExtensions.DynamicEnumType? = null,
    val messageExtension: pbandk.testpb.ForeignMessage? = null,
    val dynamicMessageExtension: pbandk.testpb.TestDynamicExtensions.DynamicMessageType? = null,
    val repeatedExtension: List<String> = emptyList(),
    val packedExtension: List<Int> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestDynamicExtensions> {
        val defaultInstance by lazy { TestDynamicExtensions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestDynamicExtensions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestDynamicExtensions> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestDynamicExtensions::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "scalar_extension",
                        number = 2000,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                        jsonName = "scalarExtension",
                        value = TestDynamicExtensions::scalarExtension
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "enum_extension",
                        number = 2001,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion, hasPresence = true),
                        jsonName = "enumExtension",
                        value = TestDynamicExtensions::enumExtension
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dynamic_enum_extension",
                        number = 2002,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestDynamicExtensions.DynamicEnumType.Companion, hasPresence = true),
                        jsonName = "dynamicEnumExtension",
                        value = TestDynamicExtensions::dynamicEnumExtension
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "message_extension",
                        number = 2003,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ForeignMessage.Companion),
                        jsonName = "messageExtension",
                        value = TestDynamicExtensions::messageExtension
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "dynamic_message_extension",
                        number = 2004,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestDynamicExtensions.DynamicMessageType.Companion),
                        jsonName = "dynamicMessageExtension",
                        value = TestDynamicExtensions::dynamicMessageExtension
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_extension",
                        number = 2005,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true)),
                        jsonName = "repeatedExtension",
                        value = TestDynamicExtensions::repeatedExtension
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_extension",
                        number = 2006,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true), packed = true),
                        jsonName = "packedExtension",
                        value = TestDynamicExtensions::packedExtension
                    )
                )
            )
        }
    }

    sealed class DynamicEnumType(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is TestDynamicExtensions.DynamicEnumType && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "TestDynamicExtensions.DynamicEnumType.${name ?: "UNRECOGNIZED"}(value=$value)"

        object DYNAMIC_FOO : DynamicEnumType(2200, "DYNAMIC_FOO")
        object DYNAMIC_BAR : DynamicEnumType(2201, "DYNAMIC_BAR")
        object DYNAMIC_BAZ : DynamicEnumType(2202, "DYNAMIC_BAZ")
        class UNRECOGNIZED(value: Int) : TestDynamicExtensions.DynamicEnumType(value)

        companion object : pbandk.Message.Enum.Companion<TestDynamicExtensions.DynamicEnumType> {
            val values: List<TestDynamicExtensions.DynamicEnumType> by lazy { listOf(DYNAMIC_FOO, DYNAMIC_BAR, DYNAMIC_BAZ) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No DynamicEnumType with name: $name")
        }
    }

    data class DynamicMessageType(
        val dynamicField: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestDynamicExtensions.DynamicMessageType> {
            val defaultInstance by lazy { TestDynamicExtensions.DynamicMessageType() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestDynamicExtensions.DynamicMessageType.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestDynamicExtensions.DynamicMessageType> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestDynamicExtensions.DynamicMessageType::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "dynamic_field",
                            number = 2100,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "dynamicField",
                            value = TestDynamicExtensions.DynamicMessageType::dynamicField
                        )
                    )
                )
            }
        }
    }
}

data class TestRepeatedScalarDifferentTagSizes(
    val repeatedFixed32: List<Int> = emptyList(),
    val repeatedInt32: List<Int> = emptyList(),
    val repeatedFixed64: List<Long> = emptyList(),
    val repeatedInt64: List<Long> = emptyList(),
    val repeatedFloat: List<Float> = emptyList(),
    val repeatedUint64: List<Long> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestRepeatedScalarDifferentTagSizes> {
        val defaultInstance by lazy { TestRepeatedScalarDifferentTagSizes() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestRepeatedScalarDifferentTagSizes.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestRepeatedScalarDifferentTagSizes> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestRepeatedScalarDifferentTagSizes::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_fixed32",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true)),
                        jsonName = "repeatedFixed32",
                        value = TestRepeatedScalarDifferentTagSizes::repeatedFixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_int32",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true)),
                        jsonName = "repeatedInt32",
                        value = TestRepeatedScalarDifferentTagSizes::repeatedInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_fixed64",
                        number = 2046,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true)),
                        jsonName = "repeatedFixed64",
                        value = TestRepeatedScalarDifferentTagSizes::repeatedFixed64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_int64",
                        number = 2047,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true)),
                        jsonName = "repeatedInt64",
                        value = TestRepeatedScalarDifferentTagSizes::repeatedInt64
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_float",
                        number = 262142,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true)),
                        jsonName = "repeatedFloat",
                        value = TestRepeatedScalarDifferentTagSizes::repeatedFloat
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_uint64",
                        number = 262143,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true)),
                        jsonName = "repeatedUint64",
                        value = TestRepeatedScalarDifferentTagSizes::repeatedUint64
                    )
                )
            )
        }
    }
}

data class TestParsingMerge(
    val requiredAllTypes: pbandk.testpb.TestAllTypes? = null,
    val optionalAllTypes: pbandk.testpb.TestAllTypes? = null,
    val repeatedAllTypes: List<pbandk.testpb.TestAllTypes> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestParsingMerge> {
        val defaultInstance by lazy { TestParsingMerge() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestParsingMerge.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestParsingMerge> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestParsingMerge::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "required_all_types",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion),
                        jsonName = "requiredAllTypes",
                        value = TestParsingMerge::requiredAllTypes
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_all_types",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion),
                        jsonName = "optionalAllTypes",
                        value = TestParsingMerge::optionalAllTypes
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_all_types",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestAllTypes>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion)),
                        jsonName = "repeatedAllTypes",
                        value = TestParsingMerge::repeatedAllTypes
                    )
                )
            )
        }
    }

    data class RepeatedFieldsGenerator(
        val field1: List<pbandk.testpb.TestAllTypes> = emptyList(),
        val field2: List<pbandk.testpb.TestAllTypes> = emptyList(),
        val field3: List<pbandk.testpb.TestAllTypes> = emptyList(),
        val ext1: List<pbandk.testpb.TestAllTypes> = emptyList(),
        val ext2: List<pbandk.testpb.TestAllTypes> = emptyList(),
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestParsingMerge.RepeatedFieldsGenerator> {
            val defaultInstance by lazy { TestParsingMerge.RepeatedFieldsGenerator() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestParsingMerge.RepeatedFieldsGenerator.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestParsingMerge.RepeatedFieldsGenerator> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestParsingMerge.RepeatedFieldsGenerator::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "field1",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestAllTypes>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion)),
                            jsonName = "field1",
                            value = TestParsingMerge.RepeatedFieldsGenerator::field1
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "field2",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestAllTypes>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion)),
                            jsonName = "field2",
                            value = TestParsingMerge.RepeatedFieldsGenerator::field2
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "field3",
                            number = 3,
                            type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestAllTypes>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion)),
                            jsonName = "field3",
                            value = TestParsingMerge.RepeatedFieldsGenerator::field3
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "ext1",
                            number = 1000,
                            type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestAllTypes>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion)),
                            jsonName = "ext1",
                            value = TestParsingMerge.RepeatedFieldsGenerator::ext1
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "ext2",
                            number = 1001,
                            type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestAllTypes>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion)),
                            jsonName = "ext2",
                            value = TestParsingMerge.RepeatedFieldsGenerator::ext2
                        )
                    )
                )
            }
        }

        data class Group1(
            val field1: pbandk.testpb.TestAllTypes? = null,
            override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ) : pbandk.Message {
            override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
            override val descriptor get() = Companion.descriptor
            override val protoSize by lazy { super.protoSize }
            companion object : pbandk.Message.Companion<TestParsingMerge.RepeatedFieldsGenerator.Group1> {
                val defaultInstance by lazy { TestParsingMerge.RepeatedFieldsGenerator.Group1() }
                override fun decodeWith(u: pbandk.MessageDecoder) = TestParsingMerge.RepeatedFieldsGenerator.Group1.decodeWithImpl(u)

                override val descriptor: pbandk.MessageDescriptor<TestParsingMerge.RepeatedFieldsGenerator.Group1> by lazy {
                    pbandk.MessageDescriptor(
                        messageClass = TestParsingMerge.RepeatedFieldsGenerator.Group1::class,
                        messageCompanion = this,
                        fields = listOf(
                            pbandk.FieldDescriptor(
                                messageDescriptor = this::descriptor,
                                name = "field1",
                                number = 11,
                                type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion),
                                jsonName = "field1",
                                value = TestParsingMerge.RepeatedFieldsGenerator.Group1::field1
                            )
                        )
                    )
                }
            }
        }

        data class Group2(
            val field1: pbandk.testpb.TestAllTypes? = null,
            override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ) : pbandk.Message {
            override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
            override val descriptor get() = Companion.descriptor
            override val protoSize by lazy { super.protoSize }
            companion object : pbandk.Message.Companion<TestParsingMerge.RepeatedFieldsGenerator.Group2> {
                val defaultInstance by lazy { TestParsingMerge.RepeatedFieldsGenerator.Group2() }
                override fun decodeWith(u: pbandk.MessageDecoder) = TestParsingMerge.RepeatedFieldsGenerator.Group2.decodeWithImpl(u)

                override val descriptor: pbandk.MessageDescriptor<TestParsingMerge.RepeatedFieldsGenerator.Group2> by lazy {
                    pbandk.MessageDescriptor(
                        messageClass = TestParsingMerge.RepeatedFieldsGenerator.Group2::class,
                        messageCompanion = this,
                        fields = listOf(
                            pbandk.FieldDescriptor(
                                messageDescriptor = this::descriptor,
                                name = "field1",
                                number = 21,
                                type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion),
                                jsonName = "field1",
                                value = TestParsingMerge.RepeatedFieldsGenerator.Group2::field1
                            )
                        )
                    )
                }
            }
        }
    }

    data class OptionalGroup(
        val optionalGroupAllTypes: pbandk.testpb.TestAllTypes? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestParsingMerge.OptionalGroup> {
            val defaultInstance by lazy { TestParsingMerge.OptionalGroup() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestParsingMerge.OptionalGroup.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestParsingMerge.OptionalGroup> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestParsingMerge.OptionalGroup::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "optional_group_all_types",
                            number = 11,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion),
                            jsonName = "optionalGroupAllTypes",
                            value = TestParsingMerge.OptionalGroup::optionalGroupAllTypes
                        )
                    )
                )
            }
        }
    }

    data class RepeatedGroup(
        val repeatedGroupAllTypes: pbandk.testpb.TestAllTypes? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestParsingMerge.RepeatedGroup> {
            val defaultInstance by lazy { TestParsingMerge.RepeatedGroup() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestParsingMerge.RepeatedGroup.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestParsingMerge.RepeatedGroup> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestParsingMerge.RepeatedGroup::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "repeated_group_all_types",
                            number = 21,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion),
                            jsonName = "repeatedGroupAllTypes",
                            value = TestParsingMerge.RepeatedGroup::repeatedGroupAllTypes
                        )
                    )
                )
            }
        }
    }
}

data class TestCommentInjectionMessage(
    val a: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestCommentInjectionMessage> {
        val defaultInstance by lazy { TestCommentInjectionMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestCommentInjectionMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestCommentInjectionMessage> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestCommentInjectionMessage::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "a",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "a",
                        value = TestCommentInjectionMessage::a
                    )
                )
            )
        }
    }
}

data class FooRequest(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<FooRequest> {
        val defaultInstance by lazy { FooRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder) = FooRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<FooRequest> by lazy {
            pbandk.MessageDescriptor(
                messageClass = FooRequest::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

data class FooResponse(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<FooResponse> {
        val defaultInstance by lazy { FooResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder) = FooResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<FooResponse> by lazy {
            pbandk.MessageDescriptor(
                messageClass = FooResponse::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

data class FooClientMessage(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<FooClientMessage> {
        val defaultInstance by lazy { FooClientMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder) = FooClientMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<FooClientMessage> by lazy {
            pbandk.MessageDescriptor(
                messageClass = FooClientMessage::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

data class FooServerMessage(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<FooServerMessage> {
        val defaultInstance by lazy { FooServerMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder) = FooServerMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<FooServerMessage> by lazy {
            pbandk.MessageDescriptor(
                messageClass = FooServerMessage::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

data class BarRequest(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<BarRequest> {
        val defaultInstance by lazy { BarRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder) = BarRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<BarRequest> by lazy {
            pbandk.MessageDescriptor(
                messageClass = BarRequest::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

data class BarResponse(
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<BarResponse> {
        val defaultInstance by lazy { BarResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder) = BarResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<BarResponse> by lazy {
            pbandk.MessageDescriptor(
                messageClass = BarResponse::class,
                messageCompanion = this,
                fields = listOf(
                )
            )
        }
    }
}

data class TestJsonName(
    val fieldName1: Int? = null,
    val fieldName2: Int? = null,
    val fieldName3: Int? = null,
    val fieldName4: Int? = null,
    val fIELDNAME5: Int? = null,
    val fieldName6: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestJsonName> {
        val defaultInstance by lazy { TestJsonName() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestJsonName.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestJsonName> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestJsonName::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field_name1",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName1",
                        value = TestJsonName::fieldName1
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "fieldName2",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fieldName2",
                        value = TestJsonName::fieldName2
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "FieldName3",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FieldName3",
                        value = TestJsonName::fieldName3
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "_field_name4",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FieldName4",
                        value = TestJsonName::fieldName4
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "FIELD_NAME5",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "FIELDNAME5",
                        value = TestJsonName::fIELDNAME5
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field_name6",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "@type",
                        value = TestJsonName::fieldName6
                    )
                )
            )
        }
    }
}

data class TestHugeFieldNumbers(
    val optionalInt32: Int? = null,
    val fixed32: Int? = null,
    val repeatedInt32: List<Int> = emptyList(),
    val packedInt32: List<Int> = emptyList(),
    val optionalEnum: pbandk.testpb.ForeignEnum? = null,
    val optionalString: String? = null,
    val optionalBytes: pbandk.ByteArr? = null,
    val optionalMessage: pbandk.testpb.ForeignMessage? = null,
    val stringStringMap: Map<String?, String?> = emptyMap(),
    val oneofField: OneofField<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    sealed class OneofField<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class OneofUint32(oneofUint32: Int? = null) : OneofField<Int?>(oneofUint32)
        class OneofTestAllTypes(oneofTestAllTypes: pbandk.testpb.TestAllTypes?) : OneofField<pbandk.testpb.TestAllTypes?>(oneofTestAllTypes)
        class OneofString(oneofString: String? = null) : OneofField<String?>(oneofString)
        class OneofBytes(oneofBytes: pbandk.ByteArr? = null) : OneofField<pbandk.ByteArr?>(oneofBytes)
    }

    val oneofUint32: Int??
        get() = (oneofField as? OneofField.OneofUint32)?.value
    val oneofTestAllTypes: pbandk.testpb.TestAllTypes??
        get() = (oneofField as? OneofField.OneofTestAllTypes)?.value
    val oneofString: String??
        get() = (oneofField as? OneofField.OneofString)?.value
    val oneofBytes: pbandk.ByteArr??
        get() = (oneofField as? OneofField.OneofBytes)?.value

    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestHugeFieldNumbers> {
        val defaultInstance by lazy { TestHugeFieldNumbers() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestHugeFieldNumbers.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestHugeFieldNumbers> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestHugeFieldNumbers::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_int32",
                        number = 536870000,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "optionalInt32",
                        value = TestHugeFieldNumbers::optionalInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "fixed_32",
                        number = 536870001,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "fixed32",
                        value = TestHugeFieldNumbers::fixed32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "repeated_int32",
                        number = 536870002,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true)),
                        jsonName = "repeatedInt32",
                        value = TestHugeFieldNumbers::repeatedInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "packed_int32",
                        number = 536870003,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true), packed = true),
                        jsonName = "packedInt32",
                        value = TestHugeFieldNumbers::packedInt32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_enum",
                        number = 536870004,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion, hasPresence = true),
                        jsonName = "optionalEnum",
                        value = TestHugeFieldNumbers::optionalEnum
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_string",
                        number = 536870005,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "optionalString",
                        value = TestHugeFieldNumbers::optionalString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_bytes",
                        number = 536870006,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "optionalBytes",
                        value = TestHugeFieldNumbers::optionalBytes
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "optional_message",
                        number = 536870007,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ForeignMessage.Companion),
                        jsonName = "optionalMessage",
                        value = TestHugeFieldNumbers::optionalMessage
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "string_string_map",
                        number = 536870010,
                        type = pbandk.FieldDescriptor.Type.Map<String?, String?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true), valueType = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true)),
                        jsonName = "stringStringMap",
                        value = TestHugeFieldNumbers::stringStringMap
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_uint32",
                        number = 536870011,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofUint32",
                        value = TestHugeFieldNumbers::oneofUint32
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_test_all_types",
                        number = 536870012,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypes.Companion),
                        oneofMember = true,
                        jsonName = "oneofTestAllTypes",
                        value = TestHugeFieldNumbers::oneofTestAllTypes
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_string",
                        number = 536870013,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofString",
                        value = TestHugeFieldNumbers::oneofString
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "oneof_bytes",
                        number = 536870014,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofBytes",
                        value = TestHugeFieldNumbers::oneofBytes
                    )
                )
            )
        }
    }

    data class OptionalGroup(
        val groupA: Int? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestHugeFieldNumbers.OptionalGroup> {
            val defaultInstance by lazy { TestHugeFieldNumbers.OptionalGroup() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestHugeFieldNumbers.OptionalGroup.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestHugeFieldNumbers.OptionalGroup> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestHugeFieldNumbers.OptionalGroup::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "group_a",
                            number = 536870009,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                            jsonName = "groupA",
                            value = TestHugeFieldNumbers.OptionalGroup::groupA
                        )
                    )
                )
            }
        }
    }

    data class StringStringMapEntry(
        override val key: String? = null,
        override val value: String? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String?, String?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        companion object : pbandk.Message.Companion<TestHugeFieldNumbers.StringStringMapEntry> {
            val defaultInstance by lazy { TestHugeFieldNumbers.StringStringMapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = TestHugeFieldNumbers.StringStringMapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<TestHugeFieldNumbers.StringStringMapEntry> by lazy {
                pbandk.MessageDescriptor(
                    messageClass = TestHugeFieldNumbers.StringStringMapEntry::class,
                    messageCompanion = this,
                    fields = listOf(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "key",
                            value = TestHugeFieldNumbers.StringStringMapEntry::key
                        ),
                        pbandk.FieldDescriptor(
                            messageDescriptor = this::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "value",
                            value = TestHugeFieldNumbers.StringStringMapEntry::value
                        )
                    )
                )
            }
        }
    }
}

data class TestExtensionInsideTable(
    val field1: Int? = null,
    val field2: Int? = null,
    val field3: Int? = null,
    val field4: Int? = null,
    val field6: Int? = null,
    val field7: Int? = null,
    val field8: Int? = null,
    val field9: Int? = null,
    val field10: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    companion object : pbandk.Message.Companion<TestExtensionInsideTable> {
        val defaultInstance by lazy { TestExtensionInsideTable() }
        override fun decodeWith(u: pbandk.MessageDecoder) = TestExtensionInsideTable.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<TestExtensionInsideTable> by lazy {
            pbandk.MessageDescriptor(
                messageClass = TestExtensionInsideTable::class,
                messageCompanion = this,
                fields = listOf(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field1",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "field1",
                        value = TestExtensionInsideTable::field1
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field2",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "field2",
                        value = TestExtensionInsideTable::field2
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field3",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "field3",
                        value = TestExtensionInsideTable::field3
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field4",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "field4",
                        value = TestExtensionInsideTable::field4
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field6",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "field6",
                        value = TestExtensionInsideTable::field6
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field7",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "field7",
                        value = TestExtensionInsideTable::field7
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field8",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "field8",
                        value = TestExtensionInsideTable::field8
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field9",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "field9",
                        value = TestExtensionInsideTable::field9
                    ),
                    pbandk.FieldDescriptor(
                        messageDescriptor = this::descriptor,
                        name = "field10",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "field10",
                        value = TestExtensionInsideTable::field10
                    )
                )
            )
        }
    }
}

fun TestAllTypes?.orDefault() = this ?: TestAllTypes.defaultInstance

private fun TestAllTypes.protoMergeImpl(plus: pbandk.Message?): TestAllTypes = (plus as? TestAllTypes)?.copy(
    optionalInt32 = plus.optionalInt32 ?: optionalInt32,
    optionalInt64 = plus.optionalInt64 ?: optionalInt64,
    optionalUint32 = plus.optionalUint32 ?: optionalUint32,
    optionalUint64 = plus.optionalUint64 ?: optionalUint64,
    optionalSint32 = plus.optionalSint32 ?: optionalSint32,
    optionalSint64 = plus.optionalSint64 ?: optionalSint64,
    optionalFixed32 = plus.optionalFixed32 ?: optionalFixed32,
    optionalFixed64 = plus.optionalFixed64 ?: optionalFixed64,
    optionalSfixed32 = plus.optionalSfixed32 ?: optionalSfixed32,
    optionalSfixed64 = plus.optionalSfixed64 ?: optionalSfixed64,
    optionalFloat = plus.optionalFloat ?: optionalFloat,
    optionalDouble = plus.optionalDouble ?: optionalDouble,
    optionalBool = plus.optionalBool ?: optionalBool,
    optionalString = plus.optionalString ?: optionalString,
    optionalBytes = plus.optionalBytes ?: optionalBytes,
    optionalNestedMessage = optionalNestedMessage?.plus(plus.optionalNestedMessage) ?: plus.optionalNestedMessage,
    optionalForeignMessage = optionalForeignMessage?.plus(plus.optionalForeignMessage) ?: plus.optionalForeignMessage,
    optionalImportMessage = optionalImportMessage?.plus(plus.optionalImportMessage) ?: plus.optionalImportMessage,
    optionalNestedEnum = plus.optionalNestedEnum ?: optionalNestedEnum,
    optionalForeignEnum = plus.optionalForeignEnum ?: optionalForeignEnum,
    optionalImportEnum = plus.optionalImportEnum ?: optionalImportEnum,
    optionalStringPiece = plus.optionalStringPiece ?: optionalStringPiece,
    optionalCord = plus.optionalCord ?: optionalCord,
    optionalPublicImportMessage = optionalPublicImportMessage?.plus(plus.optionalPublicImportMessage) ?: plus.optionalPublicImportMessage,
    optionalLazyMessage = optionalLazyMessage?.plus(plus.optionalLazyMessage) ?: plus.optionalLazyMessage,
    repeatedInt32 = repeatedInt32 + plus.repeatedInt32,
    repeatedInt64 = repeatedInt64 + plus.repeatedInt64,
    repeatedUint32 = repeatedUint32 + plus.repeatedUint32,
    repeatedUint64 = repeatedUint64 + plus.repeatedUint64,
    repeatedSint32 = repeatedSint32 + plus.repeatedSint32,
    repeatedSint64 = repeatedSint64 + plus.repeatedSint64,
    repeatedFixed32 = repeatedFixed32 + plus.repeatedFixed32,
    repeatedFixed64 = repeatedFixed64 + plus.repeatedFixed64,
    repeatedSfixed32 = repeatedSfixed32 + plus.repeatedSfixed32,
    repeatedSfixed64 = repeatedSfixed64 + plus.repeatedSfixed64,
    repeatedFloat = repeatedFloat + plus.repeatedFloat,
    repeatedDouble = repeatedDouble + plus.repeatedDouble,
    repeatedBool = repeatedBool + plus.repeatedBool,
    repeatedString = repeatedString + plus.repeatedString,
    repeatedBytes = repeatedBytes + plus.repeatedBytes,
    repeatedNestedMessage = repeatedNestedMessage + plus.repeatedNestedMessage,
    repeatedForeignMessage = repeatedForeignMessage + plus.repeatedForeignMessage,
    repeatedImportMessage = repeatedImportMessage + plus.repeatedImportMessage,
    repeatedNestedEnum = repeatedNestedEnum + plus.repeatedNestedEnum,
    repeatedForeignEnum = repeatedForeignEnum + plus.repeatedForeignEnum,
    repeatedImportEnum = repeatedImportEnum + plus.repeatedImportEnum,
    repeatedStringPiece = repeatedStringPiece + plus.repeatedStringPiece,
    repeatedCord = repeatedCord + plus.repeatedCord,
    repeatedLazyMessage = repeatedLazyMessage + plus.repeatedLazyMessage,
    defaultInt32 = plus.defaultInt32 ?: defaultInt32,
    defaultInt64 = plus.defaultInt64 ?: defaultInt64,
    defaultUint32 = plus.defaultUint32 ?: defaultUint32,
    defaultUint64 = plus.defaultUint64 ?: defaultUint64,
    defaultSint32 = plus.defaultSint32 ?: defaultSint32,
    defaultSint64 = plus.defaultSint64 ?: defaultSint64,
    defaultFixed32 = plus.defaultFixed32 ?: defaultFixed32,
    defaultFixed64 = plus.defaultFixed64 ?: defaultFixed64,
    defaultSfixed32 = plus.defaultSfixed32 ?: defaultSfixed32,
    defaultSfixed64 = plus.defaultSfixed64 ?: defaultSfixed64,
    defaultFloat = plus.defaultFloat ?: defaultFloat,
    defaultDouble = plus.defaultDouble ?: defaultDouble,
    defaultBool = plus.defaultBool ?: defaultBool,
    defaultString = plus.defaultString ?: defaultString,
    defaultBytes = plus.defaultBytes ?: defaultBytes,
    defaultNestedEnum = plus.defaultNestedEnum ?: defaultNestedEnum,
    defaultForeignEnum = plus.defaultForeignEnum ?: defaultForeignEnum,
    defaultImportEnum = plus.defaultImportEnum ?: defaultImportEnum,
    defaultStringPiece = plus.defaultStringPiece ?: defaultStringPiece,
    defaultCord = plus.defaultCord ?: defaultCord,
    oneofField = when {
        oneofField is TestAllTypes.OneofField.OneofNestedMessage && plus.oneofField is TestAllTypes.OneofField.OneofNestedMessage ->
            TestAllTypes.OneofField.OneofNestedMessage(oneofField.value + plus.oneofField.value)
        else ->
            plus.oneofField ?: oneofField
    },
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypes.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypes {
    var optionalInt32: Int? = null
    var optionalInt64: Long? = null
    var optionalUint32: Int? = null
    var optionalUint64: Long? = null
    var optionalSint32: Int? = null
    var optionalSint64: Long? = null
    var optionalFixed32: Int? = null
    var optionalFixed64: Long? = null
    var optionalSfixed32: Int? = null
    var optionalSfixed64: Long? = null
    var optionalFloat: Float? = null
    var optionalDouble: Double? = null
    var optionalBool: Boolean? = null
    var optionalString: String? = null
    var optionalBytes: pbandk.ByteArr? = null
    var optionalNestedMessage: pbandk.testpb.TestAllTypes.NestedMessage? = null
    var optionalForeignMessage: pbandk.testpb.ForeignMessage? = null
    var optionalImportMessage: pbandk.testpb.ImportMessage? = null
    var optionalNestedEnum: pbandk.testpb.TestAllTypes.NestedEnum? = null
    var optionalForeignEnum: pbandk.testpb.ForeignEnum? = null
    var optionalImportEnum: pbandk.testpb.ImportEnum? = null
    var optionalStringPiece: String? = null
    var optionalCord: String? = null
    var optionalPublicImportMessage: pbandk.testpb.PublicImportMessage? = null
    var optionalLazyMessage: pbandk.testpb.TestAllTypes.NestedMessage? = null
    var repeatedInt32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedInt64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedUint32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedUint64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedSint32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedSint64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedFixed32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedFixed64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedSfixed32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedSfixed64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedFloat: pbandk.ListWithSize.Builder<Float>? = null
    var repeatedDouble: pbandk.ListWithSize.Builder<Double>? = null
    var repeatedBool: pbandk.ListWithSize.Builder<Boolean>? = null
    var repeatedString: pbandk.ListWithSize.Builder<String>? = null
    var repeatedBytes: pbandk.ListWithSize.Builder<pbandk.ByteArr>? = null
    var repeatedNestedMessage: pbandk.ListWithSize.Builder<pbandk.testpb.TestAllTypes.NestedMessage>? = null
    var repeatedForeignMessage: pbandk.ListWithSize.Builder<pbandk.testpb.ForeignMessage>? = null
    var repeatedImportMessage: pbandk.ListWithSize.Builder<pbandk.testpb.ImportMessage>? = null
    var repeatedNestedEnum: pbandk.ListWithSize.Builder<pbandk.testpb.TestAllTypes.NestedEnum>? = null
    var repeatedForeignEnum: pbandk.ListWithSize.Builder<pbandk.testpb.ForeignEnum>? = null
    var repeatedImportEnum: pbandk.ListWithSize.Builder<pbandk.testpb.ImportEnum>? = null
    var repeatedStringPiece: pbandk.ListWithSize.Builder<String>? = null
    var repeatedCord: pbandk.ListWithSize.Builder<String>? = null
    var repeatedLazyMessage: pbandk.ListWithSize.Builder<pbandk.testpb.TestAllTypes.NestedMessage>? = null
    var defaultInt32: Int? = null
    var defaultInt64: Long? = null
    var defaultUint32: Int? = null
    var defaultUint64: Long? = null
    var defaultSint32: Int? = null
    var defaultSint64: Long? = null
    var defaultFixed32: Int? = null
    var defaultFixed64: Long? = null
    var defaultSfixed32: Int? = null
    var defaultSfixed64: Long? = null
    var defaultFloat: Float? = null
    var defaultDouble: Double? = null
    var defaultBool: Boolean? = null
    var defaultString: String? = null
    var defaultBytes: pbandk.ByteArr? = null
    var defaultNestedEnum: pbandk.testpb.TestAllTypes.NestedEnum? = null
    var defaultForeignEnum: pbandk.testpb.ForeignEnum? = null
    var defaultImportEnum: pbandk.testpb.ImportEnum? = null
    var defaultStringPiece: String? = null
    var defaultCord: String? = null
    var oneofField: TestAllTypes.OneofField<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> optionalInt32 = _fieldValue as Int
            2 -> optionalInt64 = _fieldValue as Long
            3 -> optionalUint32 = _fieldValue as Int
            4 -> optionalUint64 = _fieldValue as Long
            5 -> optionalSint32 = _fieldValue as Int
            6 -> optionalSint64 = _fieldValue as Long
            7 -> optionalFixed32 = _fieldValue as Int
            8 -> optionalFixed64 = _fieldValue as Long
            9 -> optionalSfixed32 = _fieldValue as Int
            10 -> optionalSfixed64 = _fieldValue as Long
            11 -> optionalFloat = _fieldValue as Float
            12 -> optionalDouble = _fieldValue as Double
            13 -> optionalBool = _fieldValue as Boolean
            14 -> optionalString = _fieldValue as String
            15 -> optionalBytes = _fieldValue as pbandk.ByteArr
            18 -> optionalNestedMessage = _fieldValue as pbandk.testpb.TestAllTypes.NestedMessage
            19 -> optionalForeignMessage = _fieldValue as pbandk.testpb.ForeignMessage
            20 -> optionalImportMessage = _fieldValue as pbandk.testpb.ImportMessage
            21 -> optionalNestedEnum = _fieldValue as pbandk.testpb.TestAllTypes.NestedEnum
            22 -> optionalForeignEnum = _fieldValue as pbandk.testpb.ForeignEnum
            23 -> optionalImportEnum = _fieldValue as pbandk.testpb.ImportEnum
            24 -> optionalStringPiece = _fieldValue as String
            25 -> optionalCord = _fieldValue as String
            26 -> optionalPublicImportMessage = _fieldValue as pbandk.testpb.PublicImportMessage
            27 -> optionalLazyMessage = _fieldValue as pbandk.testpb.TestAllTypes.NestedMessage
            31 -> repeatedInt32 = (repeatedInt32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            32 -> repeatedInt64 = (repeatedInt64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            33 -> repeatedUint32 = (repeatedUint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            34 -> repeatedUint64 = (repeatedUint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            35 -> repeatedSint32 = (repeatedSint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            36 -> repeatedSint64 = (repeatedSint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            37 -> repeatedFixed32 = (repeatedFixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            38 -> repeatedFixed64 = (repeatedFixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            39 -> repeatedSfixed32 = (repeatedSfixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            40 -> repeatedSfixed64 = (repeatedSfixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            41 -> repeatedFloat = (repeatedFloat ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            42 -> repeatedDouble = (repeatedDouble ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
            43 -> repeatedBool = (repeatedBool ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Boolean> }
            44 -> repeatedString = (repeatedString ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            45 -> repeatedBytes = (repeatedBytes ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.ByteArr> }
            48 -> repeatedNestedMessage = (repeatedNestedMessage ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestAllTypes.NestedMessage> }
            49 -> repeatedForeignMessage = (repeatedForeignMessage ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.ForeignMessage> }
            50 -> repeatedImportMessage = (repeatedImportMessage ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.ImportMessage> }
            51 -> repeatedNestedEnum = (repeatedNestedEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestAllTypes.NestedEnum> }
            52 -> repeatedForeignEnum = (repeatedForeignEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.ForeignEnum> }
            53 -> repeatedImportEnum = (repeatedImportEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.ImportEnum> }
            54 -> repeatedStringPiece = (repeatedStringPiece ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            55 -> repeatedCord = (repeatedCord ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            57 -> repeatedLazyMessage = (repeatedLazyMessage ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestAllTypes.NestedMessage> }
            61 -> defaultInt32 = _fieldValue as Int
            62 -> defaultInt64 = _fieldValue as Long
            63 -> defaultUint32 = _fieldValue as Int
            64 -> defaultUint64 = _fieldValue as Long
            65 -> defaultSint32 = _fieldValue as Int
            66 -> defaultSint64 = _fieldValue as Long
            67 -> defaultFixed32 = _fieldValue as Int
            68 -> defaultFixed64 = _fieldValue as Long
            69 -> defaultSfixed32 = _fieldValue as Int
            70 -> defaultSfixed64 = _fieldValue as Long
            71 -> defaultFloat = _fieldValue as Float
            72 -> defaultDouble = _fieldValue as Double
            73 -> defaultBool = _fieldValue as Boolean
            74 -> defaultString = _fieldValue as String
            75 -> defaultBytes = _fieldValue as pbandk.ByteArr
            81 -> defaultNestedEnum = _fieldValue as pbandk.testpb.TestAllTypes.NestedEnum
            82 -> defaultForeignEnum = _fieldValue as pbandk.testpb.ForeignEnum
            83 -> defaultImportEnum = _fieldValue as pbandk.testpb.ImportEnum
            84 -> defaultStringPiece = _fieldValue as String
            85 -> defaultCord = _fieldValue as String
            111 -> oneofField = TestAllTypes.OneofField.OneofUint32(_fieldValue as Int)
            112 -> oneofField = TestAllTypes.OneofField.OneofNestedMessage(_fieldValue as pbandk.testpb.TestAllTypes.NestedMessage)
            113 -> oneofField = TestAllTypes.OneofField.OneofString(_fieldValue as String)
            114 -> oneofField = TestAllTypes.OneofField.OneofBytes(_fieldValue as pbandk.ByteArr)
        }
    }
    return TestAllTypes(optionalInt32, optionalInt64, optionalUint32, optionalUint64,
        optionalSint32, optionalSint64, optionalFixed32, optionalFixed64,
        optionalSfixed32, optionalSfixed64, optionalFloat, optionalDouble,
        optionalBool, optionalString, optionalBytes, optionalNestedMessage,
        optionalForeignMessage, optionalImportMessage, optionalNestedEnum, optionalForeignEnum,
        optionalImportEnum, optionalStringPiece, optionalCord, optionalPublicImportMessage,
        optionalLazyMessage, pbandk.ListWithSize.Builder.fixed(repeatedInt32), pbandk.ListWithSize.Builder.fixed(repeatedInt64), pbandk.ListWithSize.Builder.fixed(repeatedUint32),
        pbandk.ListWithSize.Builder.fixed(repeatedUint64), pbandk.ListWithSize.Builder.fixed(repeatedSint32), pbandk.ListWithSize.Builder.fixed(repeatedSint64), pbandk.ListWithSize.Builder.fixed(repeatedFixed32),
        pbandk.ListWithSize.Builder.fixed(repeatedFixed64), pbandk.ListWithSize.Builder.fixed(repeatedSfixed32), pbandk.ListWithSize.Builder.fixed(repeatedSfixed64), pbandk.ListWithSize.Builder.fixed(repeatedFloat),
        pbandk.ListWithSize.Builder.fixed(repeatedDouble), pbandk.ListWithSize.Builder.fixed(repeatedBool), pbandk.ListWithSize.Builder.fixed(repeatedString), pbandk.ListWithSize.Builder.fixed(repeatedBytes),
        pbandk.ListWithSize.Builder.fixed(repeatedNestedMessage), pbandk.ListWithSize.Builder.fixed(repeatedForeignMessage), pbandk.ListWithSize.Builder.fixed(repeatedImportMessage), pbandk.ListWithSize.Builder.fixed(repeatedNestedEnum),
        pbandk.ListWithSize.Builder.fixed(repeatedForeignEnum), pbandk.ListWithSize.Builder.fixed(repeatedImportEnum), pbandk.ListWithSize.Builder.fixed(repeatedStringPiece), pbandk.ListWithSize.Builder.fixed(repeatedCord),
        pbandk.ListWithSize.Builder.fixed(repeatedLazyMessage), defaultInt32, defaultInt64, defaultUint32,
        defaultUint64, defaultSint32, defaultSint64, defaultFixed32,
        defaultFixed64, defaultSfixed32, defaultSfixed64, defaultFloat,
        defaultDouble, defaultBool, defaultString, defaultBytes,
        defaultNestedEnum, defaultForeignEnum, defaultImportEnum, defaultStringPiece,
        defaultCord, oneofField, unknownFields)
}

fun TestAllTypes.NestedMessage?.orDefault() = this ?: TestAllTypes.NestedMessage.defaultInstance

private fun TestAllTypes.NestedMessage.protoMergeImpl(plus: pbandk.Message?): TestAllTypes.NestedMessage = (plus as? TestAllTypes.NestedMessage)?.copy(
    bb = plus.bb ?: bb,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypes.NestedMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypes.NestedMessage {
    var bb: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> bb = _fieldValue as Int
        }
    }
    return TestAllTypes.NestedMessage(bb, unknownFields)
}

fun TestAllTypes.OptionalGroup?.orDefault() = this ?: TestAllTypes.OptionalGroup.defaultInstance

private fun TestAllTypes.OptionalGroup.protoMergeImpl(plus: pbandk.Message?): TestAllTypes.OptionalGroup = (plus as? TestAllTypes.OptionalGroup)?.copy(
    a = plus.a ?: a,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypes.OptionalGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypes.OptionalGroup {
    var a: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            17 -> a = _fieldValue as Int
        }
    }
    return TestAllTypes.OptionalGroup(a, unknownFields)
}

fun TestAllTypes.RepeatedGroup?.orDefault() = this ?: TestAllTypes.RepeatedGroup.defaultInstance

private fun TestAllTypes.RepeatedGroup.protoMergeImpl(plus: pbandk.Message?): TestAllTypes.RepeatedGroup = (plus as? TestAllTypes.RepeatedGroup)?.copy(
    a = plus.a ?: a,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypes.RepeatedGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypes.RepeatedGroup {
    var a: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            47 -> a = _fieldValue as Int
        }
    }
    return TestAllTypes.RepeatedGroup(a, unknownFields)
}

fun NestedTestAllTypes?.orDefault() = this ?: NestedTestAllTypes.defaultInstance

private fun NestedTestAllTypes.protoMergeImpl(plus: pbandk.Message?): NestedTestAllTypes = (plus as? NestedTestAllTypes)?.copy(
    child = child?.plus(plus.child) ?: plus.child,
    payload = payload?.plus(plus.payload) ?: plus.payload,
    repeatedChild = repeatedChild + plus.repeatedChild,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun NestedTestAllTypes.Companion.decodeWithImpl(u: pbandk.MessageDecoder): NestedTestAllTypes {
    var child: pbandk.testpb.NestedTestAllTypes? = null
    var payload: pbandk.testpb.TestAllTypes? = null
    var repeatedChild: pbandk.ListWithSize.Builder<pbandk.testpb.NestedTestAllTypes>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> child = _fieldValue as pbandk.testpb.NestedTestAllTypes
            2 -> payload = _fieldValue as pbandk.testpb.TestAllTypes
            3 -> repeatedChild = (repeatedChild ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.NestedTestAllTypes> }
        }
    }
    return NestedTestAllTypes(child, payload, pbandk.ListWithSize.Builder.fixed(repeatedChild), unknownFields)
}

fun TestDeprecatedFields?.orDefault() = this ?: TestDeprecatedFields.defaultInstance

private fun TestDeprecatedFields.protoMergeImpl(plus: pbandk.Message?): TestDeprecatedFields = (plus as? TestDeprecatedFields)?.copy(
    deprecatedInt32 = plus.deprecatedInt32 ?: deprecatedInt32,
    oneofFields = plus.oneofFields ?: oneofFields,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestDeprecatedFields.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestDeprecatedFields {
    var deprecatedInt32: Int? = null
    var oneofFields: TestDeprecatedFields.OneofFields<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> deprecatedInt32 = _fieldValue as Int
            2 -> oneofFields = TestDeprecatedFields.OneofFields.DeprecatedInt32InOneof(_fieldValue as Int)
        }
    }
    return TestDeprecatedFields(deprecatedInt32, oneofFields, unknownFields)
}

fun TestDeprecatedMessage?.orDefault() = this ?: TestDeprecatedMessage.defaultInstance

private fun TestDeprecatedMessage.protoMergeImpl(plus: pbandk.Message?): TestDeprecatedMessage = (plus as? TestDeprecatedMessage)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestDeprecatedMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestDeprecatedMessage {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return TestDeprecatedMessage(unknownFields)
}

fun ForeignMessage?.orDefault() = this ?: ForeignMessage.defaultInstance

private fun ForeignMessage.protoMergeImpl(plus: pbandk.Message?): ForeignMessage = (plus as? ForeignMessage)?.copy(
    c = plus.c ?: c,
    d = plus.d ?: d,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun ForeignMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ForeignMessage {
    var c: Int? = null
    var d: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> c = _fieldValue as Int
            2 -> d = _fieldValue as Int
        }
    }
    return ForeignMessage(c, d, unknownFields)
}

fun TestReservedFields?.orDefault() = this ?: TestReservedFields.defaultInstance

private fun TestReservedFields.protoMergeImpl(plus: pbandk.Message?): TestReservedFields = (plus as? TestReservedFields)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestReservedFields.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestReservedFields {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return TestReservedFields(unknownFields)
}

fun TestAllExtensions?.orDefault() = this ?: TestAllExtensions.defaultInstance

private fun TestAllExtensions.protoMergeImpl(plus: pbandk.Message?): TestAllExtensions = (plus as? TestAllExtensions)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllExtensions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllExtensions {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return TestAllExtensions(unknownFields)
}

fun OptionalGroupExtension?.orDefault() = this ?: OptionalGroupExtension.defaultInstance

private fun OptionalGroupExtension.protoMergeImpl(plus: pbandk.Message?): OptionalGroupExtension = (plus as? OptionalGroupExtension)?.copy(
    a = plus.a ?: a,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun OptionalGroupExtension.Companion.decodeWithImpl(u: pbandk.MessageDecoder): OptionalGroupExtension {
    var a: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            17 -> a = _fieldValue as Int
        }
    }
    return OptionalGroupExtension(a, unknownFields)
}

fun RepeatedGroupExtension?.orDefault() = this ?: RepeatedGroupExtension.defaultInstance

private fun RepeatedGroupExtension.protoMergeImpl(plus: pbandk.Message?): RepeatedGroupExtension = (plus as? RepeatedGroupExtension)?.copy(
    a = plus.a ?: a,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun RepeatedGroupExtension.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RepeatedGroupExtension {
    var a: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            47 -> a = _fieldValue as Int
        }
    }
    return RepeatedGroupExtension(a, unknownFields)
}

fun TestGroup?.orDefault() = this ?: TestGroup.defaultInstance

private fun TestGroup.protoMergeImpl(plus: pbandk.Message?): TestGroup = (plus as? TestGroup)?.copy(
    optionalForeignEnum = plus.optionalForeignEnum ?: optionalForeignEnum,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestGroup {
    var optionalForeignEnum: pbandk.testpb.ForeignEnum? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            22 -> optionalForeignEnum = _fieldValue as pbandk.testpb.ForeignEnum
        }
    }
    return TestGroup(optionalForeignEnum, unknownFields)
}

fun TestGroup.OptionalGroup?.orDefault() = this ?: TestGroup.OptionalGroup.defaultInstance

private fun TestGroup.OptionalGroup.protoMergeImpl(plus: pbandk.Message?): TestGroup.OptionalGroup = (plus as? TestGroup.OptionalGroup)?.copy(
    a = plus.a ?: a,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestGroup.OptionalGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestGroup.OptionalGroup {
    var a: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            17 -> a = _fieldValue as Int
        }
    }
    return TestGroup.OptionalGroup(a, unknownFields)
}

fun TestGroupExtension?.orDefault() = this ?: TestGroupExtension.defaultInstance

private fun TestGroupExtension.protoMergeImpl(plus: pbandk.Message?): TestGroupExtension = (plus as? TestGroupExtension)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestGroupExtension.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestGroupExtension {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return TestGroupExtension(unknownFields)
}

fun TestNestedExtension?.orDefault() = this ?: TestNestedExtension.defaultInstance

private fun TestNestedExtension.protoMergeImpl(plus: pbandk.Message?): TestNestedExtension = (plus as? TestNestedExtension)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestNestedExtension.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestNestedExtension {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return TestNestedExtension(unknownFields)
}

fun TestNestedExtension.OptionalGroupExtension?.orDefault() = this ?: TestNestedExtension.OptionalGroupExtension.defaultInstance

private fun TestNestedExtension.OptionalGroupExtension.protoMergeImpl(plus: pbandk.Message?): TestNestedExtension.OptionalGroupExtension = (plus as? TestNestedExtension.OptionalGroupExtension)?.copy(
    a = plus.a ?: a,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestNestedExtension.OptionalGroupExtension.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestNestedExtension.OptionalGroupExtension {
    var a: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            17 -> a = _fieldValue as Int
        }
    }
    return TestNestedExtension.OptionalGroupExtension(a, unknownFields)
}

fun TestRequired?.orDefault() = this ?: TestRequired.defaultInstance

private fun TestRequired.protoMergeImpl(plus: pbandk.Message?): TestRequired = (plus as? TestRequired)?.copy(
    a = plus.a ?: a,
    dummy2 = plus.dummy2 ?: dummy2,
    b = plus.b ?: b,
    dummy4 = plus.dummy4 ?: dummy4,
    dummy5 = plus.dummy5 ?: dummy5,
    dummy6 = plus.dummy6 ?: dummy6,
    dummy7 = plus.dummy7 ?: dummy7,
    dummy8 = plus.dummy8 ?: dummy8,
    dummy9 = plus.dummy9 ?: dummy9,
    dummy10 = plus.dummy10 ?: dummy10,
    dummy11 = plus.dummy11 ?: dummy11,
    dummy12 = plus.dummy12 ?: dummy12,
    dummy13 = plus.dummy13 ?: dummy13,
    dummy14 = plus.dummy14 ?: dummy14,
    dummy15 = plus.dummy15 ?: dummy15,
    dummy16 = plus.dummy16 ?: dummy16,
    dummy17 = plus.dummy17 ?: dummy17,
    dummy18 = plus.dummy18 ?: dummy18,
    dummy19 = plus.dummy19 ?: dummy19,
    dummy20 = plus.dummy20 ?: dummy20,
    dummy21 = plus.dummy21 ?: dummy21,
    dummy22 = plus.dummy22 ?: dummy22,
    dummy23 = plus.dummy23 ?: dummy23,
    dummy24 = plus.dummy24 ?: dummy24,
    dummy25 = plus.dummy25 ?: dummy25,
    dummy26 = plus.dummy26 ?: dummy26,
    dummy27 = plus.dummy27 ?: dummy27,
    dummy28 = plus.dummy28 ?: dummy28,
    dummy29 = plus.dummy29 ?: dummy29,
    dummy30 = plus.dummy30 ?: dummy30,
    dummy31 = plus.dummy31 ?: dummy31,
    dummy32 = plus.dummy32 ?: dummy32,
    c = plus.c ?: c,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestRequired.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestRequired {
    var a = 0
    var dummy2: Int? = null
    var b = 0
    var dummy4: Int? = null
    var dummy5: Int? = null
    var dummy6: Int? = null
    var dummy7: Int? = null
    var dummy8: Int? = null
    var dummy9: Int? = null
    var dummy10: Int? = null
    var dummy11: Int? = null
    var dummy12: Int? = null
    var dummy13: Int? = null
    var dummy14: Int? = null
    var dummy15: Int? = null
    var dummy16: Int? = null
    var dummy17: Int? = null
    var dummy18: Int? = null
    var dummy19: Int? = null
    var dummy20: Int? = null
    var dummy21: Int? = null
    var dummy22: Int? = null
    var dummy23: Int? = null
    var dummy24: Int? = null
    var dummy25: Int? = null
    var dummy26: Int? = null
    var dummy27: Int? = null
    var dummy28: Int? = null
    var dummy29: Int? = null
    var dummy30: Int? = null
    var dummy31: Int? = null
    var dummy32: Int? = null
    var c = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> a = _fieldValue as Int
            2 -> dummy2 = _fieldValue as Int
            3 -> b = _fieldValue as Int
            4 -> dummy4 = _fieldValue as Int
            5 -> dummy5 = _fieldValue as Int
            6 -> dummy6 = _fieldValue as Int
            7 -> dummy7 = _fieldValue as Int
            8 -> dummy8 = _fieldValue as Int
            9 -> dummy9 = _fieldValue as Int
            10 -> dummy10 = _fieldValue as Int
            11 -> dummy11 = _fieldValue as Int
            12 -> dummy12 = _fieldValue as Int
            13 -> dummy13 = _fieldValue as Int
            14 -> dummy14 = _fieldValue as Int
            15 -> dummy15 = _fieldValue as Int
            16 -> dummy16 = _fieldValue as Int
            17 -> dummy17 = _fieldValue as Int
            18 -> dummy18 = _fieldValue as Int
            19 -> dummy19 = _fieldValue as Int
            20 -> dummy20 = _fieldValue as Int
            21 -> dummy21 = _fieldValue as Int
            22 -> dummy22 = _fieldValue as Int
            23 -> dummy23 = _fieldValue as Int
            24 -> dummy24 = _fieldValue as Int
            25 -> dummy25 = _fieldValue as Int
            26 -> dummy26 = _fieldValue as Int
            27 -> dummy27 = _fieldValue as Int
            28 -> dummy28 = _fieldValue as Int
            29 -> dummy29 = _fieldValue as Int
            30 -> dummy30 = _fieldValue as Int
            31 -> dummy31 = _fieldValue as Int
            32 -> dummy32 = _fieldValue as Int
            33 -> c = _fieldValue as Int
        }
    }
    return TestRequired(a, dummy2, b, dummy4,
        dummy5, dummy6, dummy7, dummy8,
        dummy9, dummy10, dummy11, dummy12,
        dummy13, dummy14, dummy15, dummy16,
        dummy17, dummy18, dummy19, dummy20,
        dummy21, dummy22, dummy23, dummy24,
        dummy25, dummy26, dummy27, dummy28,
        dummy29, dummy30, dummy31, dummy32,
        c, unknownFields)
}

fun TestRequiredForeign?.orDefault() = this ?: TestRequiredForeign.defaultInstance

private fun TestRequiredForeign.protoMergeImpl(plus: pbandk.Message?): TestRequiredForeign = (plus as? TestRequiredForeign)?.copy(
    optionalMessage = optionalMessage?.plus(plus.optionalMessage) ?: plus.optionalMessage,
    repeatedMessage = repeatedMessage + plus.repeatedMessage,
    dummy = plus.dummy ?: dummy,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestRequiredForeign.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestRequiredForeign {
    var optionalMessage: pbandk.testpb.TestRequired? = null
    var repeatedMessage: pbandk.ListWithSize.Builder<pbandk.testpb.TestRequired>? = null
    var dummy: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> optionalMessage = _fieldValue as pbandk.testpb.TestRequired
            2 -> repeatedMessage = (repeatedMessage ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestRequired> }
            3 -> dummy = _fieldValue as Int
        }
    }
    return TestRequiredForeign(optionalMessage, pbandk.ListWithSize.Builder.fixed(repeatedMessage), dummy, unknownFields)
}

fun TestRequiredMessage?.orDefault() = this ?: TestRequiredMessage.defaultInstance

private fun TestRequiredMessage.protoMergeImpl(plus: pbandk.Message?): TestRequiredMessage = (plus as? TestRequiredMessage)?.copy(
    optionalMessage = optionalMessage?.plus(plus.optionalMessage) ?: plus.optionalMessage,
    repeatedMessage = repeatedMessage + plus.repeatedMessage,
    requiredMessage = requiredMessage?.plus(plus.requiredMessage) ?: plus.requiredMessage,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestRequiredMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestRequiredMessage {
    var optionalMessage: pbandk.testpb.TestRequired? = null
    var repeatedMessage: pbandk.ListWithSize.Builder<pbandk.testpb.TestRequired>? = null
    var requiredMessage: pbandk.testpb.TestRequired? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> optionalMessage = _fieldValue as pbandk.testpb.TestRequired
            2 -> repeatedMessage = (repeatedMessage ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestRequired> }
            3 -> requiredMessage = _fieldValue as pbandk.testpb.TestRequired
        }
    }
    return TestRequiredMessage(optionalMessage, pbandk.ListWithSize.Builder.fixed(repeatedMessage), requiredMessage, unknownFields)
}

fun TestForeignNested?.orDefault() = this ?: TestForeignNested.defaultInstance

private fun TestForeignNested.protoMergeImpl(plus: pbandk.Message?): TestForeignNested = (plus as? TestForeignNested)?.copy(
    foreignNested = foreignNested?.plus(plus.foreignNested) ?: plus.foreignNested,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestForeignNested.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestForeignNested {
    var foreignNested: pbandk.testpb.TestAllTypes.NestedMessage? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> foreignNested = _fieldValue as pbandk.testpb.TestAllTypes.NestedMessage
        }
    }
    return TestForeignNested(foreignNested, unknownFields)
}

fun TestEmptyMessage?.orDefault() = this ?: TestEmptyMessage.defaultInstance

private fun TestEmptyMessage.protoMergeImpl(plus: pbandk.Message?): TestEmptyMessage = (plus as? TestEmptyMessage)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestEmptyMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestEmptyMessage {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return TestEmptyMessage(unknownFields)
}

fun TestEmptyMessageWithExtensions?.orDefault() = this ?: TestEmptyMessageWithExtensions.defaultInstance

private fun TestEmptyMessageWithExtensions.protoMergeImpl(plus: pbandk.Message?): TestEmptyMessageWithExtensions = (plus as? TestEmptyMessageWithExtensions)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestEmptyMessageWithExtensions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestEmptyMessageWithExtensions {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return TestEmptyMessageWithExtensions(unknownFields)
}

fun TestMultipleExtensionRanges?.orDefault() = this ?: TestMultipleExtensionRanges.defaultInstance

private fun TestMultipleExtensionRanges.protoMergeImpl(plus: pbandk.Message?): TestMultipleExtensionRanges = (plus as? TestMultipleExtensionRanges)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestMultipleExtensionRanges.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestMultipleExtensionRanges {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return TestMultipleExtensionRanges(unknownFields)
}

fun TestReallyLargeTagNumber?.orDefault() = this ?: TestReallyLargeTagNumber.defaultInstance

private fun TestReallyLargeTagNumber.protoMergeImpl(plus: pbandk.Message?): TestReallyLargeTagNumber = (plus as? TestReallyLargeTagNumber)?.copy(
    a = plus.a ?: a,
    bb = plus.bb ?: bb,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestReallyLargeTagNumber.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestReallyLargeTagNumber {
    var a: Int? = null
    var bb: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> a = _fieldValue as Int
            268435455 -> bb = _fieldValue as Int
        }
    }
    return TestReallyLargeTagNumber(a, bb, unknownFields)
}

fun TestRecursiveMessage?.orDefault() = this ?: TestRecursiveMessage.defaultInstance

private fun TestRecursiveMessage.protoMergeImpl(plus: pbandk.Message?): TestRecursiveMessage = (plus as? TestRecursiveMessage)?.copy(
    a = a?.plus(plus.a) ?: plus.a,
    i = plus.i ?: i,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestRecursiveMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestRecursiveMessage {
    var a: pbandk.testpb.TestRecursiveMessage? = null
    var i: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> a = _fieldValue as pbandk.testpb.TestRecursiveMessage
            2 -> i = _fieldValue as Int
        }
    }
    return TestRecursiveMessage(a, i, unknownFields)
}

fun TestMutualRecursionA?.orDefault() = this ?: TestMutualRecursionA.defaultInstance

private fun TestMutualRecursionA.protoMergeImpl(plus: pbandk.Message?): TestMutualRecursionA = (plus as? TestMutualRecursionA)?.copy(
    bb = bb?.plus(plus.bb) ?: plus.bb,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestMutualRecursionA.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestMutualRecursionA {
    var bb: pbandk.testpb.TestMutualRecursionB? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> bb = _fieldValue as pbandk.testpb.TestMutualRecursionB
        }
    }
    return TestMutualRecursionA(bb, unknownFields)
}

fun TestMutualRecursionA.SubMessage?.orDefault() = this ?: TestMutualRecursionA.SubMessage.defaultInstance

private fun TestMutualRecursionA.SubMessage.protoMergeImpl(plus: pbandk.Message?): TestMutualRecursionA.SubMessage = (plus as? TestMutualRecursionA.SubMessage)?.copy(
    b = b?.plus(plus.b) ?: plus.b,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestMutualRecursionA.SubMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestMutualRecursionA.SubMessage {
    var b: pbandk.testpb.TestMutualRecursionB? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> b = _fieldValue as pbandk.testpb.TestMutualRecursionB
        }
    }
    return TestMutualRecursionA.SubMessage(b, unknownFields)
}

fun TestMutualRecursionA.SubGroup?.orDefault() = this ?: TestMutualRecursionA.SubGroup.defaultInstance

private fun TestMutualRecursionA.SubGroup.protoMergeImpl(plus: pbandk.Message?): TestMutualRecursionA.SubGroup = (plus as? TestMutualRecursionA.SubGroup)?.copy(
    subMessage = subMessage?.plus(plus.subMessage) ?: plus.subMessage,
    notInThisScc = notInThisScc?.plus(plus.notInThisScc) ?: plus.notInThisScc,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestMutualRecursionA.SubGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestMutualRecursionA.SubGroup {
    var subMessage: pbandk.testpb.TestMutualRecursionA.SubMessage? = null
    var notInThisScc: pbandk.testpb.TestAllTypes? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            3 -> subMessage = _fieldValue as pbandk.testpb.TestMutualRecursionA.SubMessage
            4 -> notInThisScc = _fieldValue as pbandk.testpb.TestAllTypes
        }
    }
    return TestMutualRecursionA.SubGroup(subMessage, notInThisScc, unknownFields)
}

fun TestMutualRecursionB?.orDefault() = this ?: TestMutualRecursionB.defaultInstance

private fun TestMutualRecursionB.protoMergeImpl(plus: pbandk.Message?): TestMutualRecursionB = (plus as? TestMutualRecursionB)?.copy(
    a = a?.plus(plus.a) ?: plus.a,
    optionalInt32 = plus.optionalInt32 ?: optionalInt32,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestMutualRecursionB.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestMutualRecursionB {
    var a: pbandk.testpb.TestMutualRecursionA? = null
    var optionalInt32: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> a = _fieldValue as pbandk.testpb.TestMutualRecursionA
            2 -> optionalInt32 = _fieldValue as Int
        }
    }
    return TestMutualRecursionB(a, optionalInt32, unknownFields)
}

fun TestIsInitialized?.orDefault() = this ?: TestIsInitialized.defaultInstance

private fun TestIsInitialized.protoMergeImpl(plus: pbandk.Message?): TestIsInitialized = (plus as? TestIsInitialized)?.copy(
    subMessage = subMessage?.plus(plus.subMessage) ?: plus.subMessage,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestIsInitialized.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestIsInitialized {
    var subMessage: pbandk.testpb.TestIsInitialized.SubMessage? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> subMessage = _fieldValue as pbandk.testpb.TestIsInitialized.SubMessage
        }
    }
    return TestIsInitialized(subMessage, unknownFields)
}

fun TestIsInitialized.SubMessage?.orDefault() = this ?: TestIsInitialized.SubMessage.defaultInstance

private fun TestIsInitialized.SubMessage.protoMergeImpl(plus: pbandk.Message?): TestIsInitialized.SubMessage = (plus as? TestIsInitialized.SubMessage)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestIsInitialized.SubMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestIsInitialized.SubMessage {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return TestIsInitialized.SubMessage(unknownFields)
}

fun TestIsInitialized.SubMessage.SubGroup?.orDefault() = this ?: TestIsInitialized.SubMessage.SubGroup.defaultInstance

private fun TestIsInitialized.SubMessage.SubGroup.protoMergeImpl(plus: pbandk.Message?): TestIsInitialized.SubMessage.SubGroup = (plus as? TestIsInitialized.SubMessage.SubGroup)?.copy(
    i = plus.i ?: i,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestIsInitialized.SubMessage.SubGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestIsInitialized.SubMessage.SubGroup {
    var i = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            2 -> i = _fieldValue as Int
        }
    }
    return TestIsInitialized.SubMessage.SubGroup(i, unknownFields)
}

fun TestDupFieldNumber?.orDefault() = this ?: TestDupFieldNumber.defaultInstance

private fun TestDupFieldNumber.protoMergeImpl(plus: pbandk.Message?): TestDupFieldNumber = (plus as? TestDupFieldNumber)?.copy(
    a = plus.a ?: a,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestDupFieldNumber.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestDupFieldNumber {
    var a: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> a = _fieldValue as Int
        }
    }
    return TestDupFieldNumber(a, unknownFields)
}

fun TestDupFieldNumber.Foo?.orDefault() = this ?: TestDupFieldNumber.Foo.defaultInstance

private fun TestDupFieldNumber.Foo.protoMergeImpl(plus: pbandk.Message?): TestDupFieldNumber.Foo = (plus as? TestDupFieldNumber.Foo)?.copy(
    a = plus.a ?: a,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestDupFieldNumber.Foo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestDupFieldNumber.Foo {
    var a: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> a = _fieldValue as Int
        }
    }
    return TestDupFieldNumber.Foo(a, unknownFields)
}

fun TestDupFieldNumber.Bar?.orDefault() = this ?: TestDupFieldNumber.Bar.defaultInstance

private fun TestDupFieldNumber.Bar.protoMergeImpl(plus: pbandk.Message?): TestDupFieldNumber.Bar = (plus as? TestDupFieldNumber.Bar)?.copy(
    a = plus.a ?: a,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestDupFieldNumber.Bar.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestDupFieldNumber.Bar {
    var a: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> a = _fieldValue as Int
        }
    }
    return TestDupFieldNumber.Bar(a, unknownFields)
}

fun TestEagerMessage?.orDefault() = this ?: TestEagerMessage.defaultInstance

private fun TestEagerMessage.protoMergeImpl(plus: pbandk.Message?): TestEagerMessage = (plus as? TestEagerMessage)?.copy(
    subMessage = subMessage?.plus(plus.subMessage) ?: plus.subMessage,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestEagerMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestEagerMessage {
    var subMessage: pbandk.testpb.TestAllTypes? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> subMessage = _fieldValue as pbandk.testpb.TestAllTypes
        }
    }
    return TestEagerMessage(subMessage, unknownFields)
}

fun TestLazyMessage?.orDefault() = this ?: TestLazyMessage.defaultInstance

private fun TestLazyMessage.protoMergeImpl(plus: pbandk.Message?): TestLazyMessage = (plus as? TestLazyMessage)?.copy(
    subMessage = subMessage?.plus(plus.subMessage) ?: plus.subMessage,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestLazyMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestLazyMessage {
    var subMessage: pbandk.testpb.TestAllTypes? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> subMessage = _fieldValue as pbandk.testpb.TestAllTypes
        }
    }
    return TestLazyMessage(subMessage, unknownFields)
}

fun TestNestedMessageHasBits?.orDefault() = this ?: TestNestedMessageHasBits.defaultInstance

private fun TestNestedMessageHasBits.protoMergeImpl(plus: pbandk.Message?): TestNestedMessageHasBits = (plus as? TestNestedMessageHasBits)?.copy(
    optionalNestedMessage = optionalNestedMessage?.plus(plus.optionalNestedMessage) ?: plus.optionalNestedMessage,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestNestedMessageHasBits.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestNestedMessageHasBits {
    var optionalNestedMessage: pbandk.testpb.TestNestedMessageHasBits.NestedMessage? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> optionalNestedMessage = _fieldValue as pbandk.testpb.TestNestedMessageHasBits.NestedMessage
        }
    }
    return TestNestedMessageHasBits(optionalNestedMessage, unknownFields)
}

fun TestNestedMessageHasBits.NestedMessage?.orDefault() = this ?: TestNestedMessageHasBits.NestedMessage.defaultInstance

private fun TestNestedMessageHasBits.NestedMessage.protoMergeImpl(plus: pbandk.Message?): TestNestedMessageHasBits.NestedMessage = (plus as? TestNestedMessageHasBits.NestedMessage)?.copy(
    nestedmessageRepeatedInt32 = nestedmessageRepeatedInt32 + plus.nestedmessageRepeatedInt32,
    nestedmessageRepeatedForeignmessage = nestedmessageRepeatedForeignmessage + plus.nestedmessageRepeatedForeignmessage,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestNestedMessageHasBits.NestedMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestNestedMessageHasBits.NestedMessage {
    var nestedmessageRepeatedInt32: pbandk.ListWithSize.Builder<Int>? = null
    var nestedmessageRepeatedForeignmessage: pbandk.ListWithSize.Builder<pbandk.testpb.ForeignMessage>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> nestedmessageRepeatedInt32 = (nestedmessageRepeatedInt32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            2 -> nestedmessageRepeatedForeignmessage = (nestedmessageRepeatedForeignmessage ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.ForeignMessage> }
        }
    }
    return TestNestedMessageHasBits.NestedMessage(pbandk.ListWithSize.Builder.fixed(nestedmessageRepeatedInt32), pbandk.ListWithSize.Builder.fixed(nestedmessageRepeatedForeignmessage), unknownFields)
}

fun TestCamelCaseFieldNames?.orDefault() = this ?: TestCamelCaseFieldNames.defaultInstance

private fun TestCamelCaseFieldNames.protoMergeImpl(plus: pbandk.Message?): TestCamelCaseFieldNames = (plus as? TestCamelCaseFieldNames)?.copy(
    primitiveField = plus.primitiveField ?: primitiveField,
    stringField = plus.stringField ?: stringField,
    enumField = plus.enumField ?: enumField,
    messageField = messageField?.plus(plus.messageField) ?: plus.messageField,
    stringPieceField = plus.stringPieceField ?: stringPieceField,
    cordField = plus.cordField ?: cordField,
    repeatedPrimitiveField = repeatedPrimitiveField + plus.repeatedPrimitiveField,
    repeatedStringField = repeatedStringField + plus.repeatedStringField,
    repeatedEnumField = repeatedEnumField + plus.repeatedEnumField,
    repeatedMessageField = repeatedMessageField + plus.repeatedMessageField,
    repeatedStringPieceField = repeatedStringPieceField + plus.repeatedStringPieceField,
    repeatedCordField = repeatedCordField + plus.repeatedCordField,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestCamelCaseFieldNames.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestCamelCaseFieldNames {
    var primitiveField: Int? = null
    var stringField: String? = null
    var enumField: pbandk.testpb.ForeignEnum? = null
    var messageField: pbandk.testpb.ForeignMessage? = null
    var stringPieceField: String? = null
    var cordField: String? = null
    var repeatedPrimitiveField: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedStringField: pbandk.ListWithSize.Builder<String>? = null
    var repeatedEnumField: pbandk.ListWithSize.Builder<pbandk.testpb.ForeignEnum>? = null
    var repeatedMessageField: pbandk.ListWithSize.Builder<pbandk.testpb.ForeignMessage>? = null
    var repeatedStringPieceField: pbandk.ListWithSize.Builder<String>? = null
    var repeatedCordField: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> primitiveField = _fieldValue as Int
            2 -> stringField = _fieldValue as String
            3 -> enumField = _fieldValue as pbandk.testpb.ForeignEnum
            4 -> messageField = _fieldValue as pbandk.testpb.ForeignMessage
            5 -> stringPieceField = _fieldValue as String
            6 -> cordField = _fieldValue as String
            7 -> repeatedPrimitiveField = (repeatedPrimitiveField ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            8 -> repeatedStringField = (repeatedStringField ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            9 -> repeatedEnumField = (repeatedEnumField ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.ForeignEnum> }
            10 -> repeatedMessageField = (repeatedMessageField ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.ForeignMessage> }
            11 -> repeatedStringPieceField = (repeatedStringPieceField ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            12 -> repeatedCordField = (repeatedCordField ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }
    return TestCamelCaseFieldNames(primitiveField, stringField, enumField, messageField,
        stringPieceField, cordField, pbandk.ListWithSize.Builder.fixed(repeatedPrimitiveField), pbandk.ListWithSize.Builder.fixed(repeatedStringField),
        pbandk.ListWithSize.Builder.fixed(repeatedEnumField), pbandk.ListWithSize.Builder.fixed(repeatedMessageField), pbandk.ListWithSize.Builder.fixed(repeatedStringPieceField), pbandk.ListWithSize.Builder.fixed(repeatedCordField), unknownFields)
}

fun TestFieldOrderings?.orDefault() = this ?: TestFieldOrderings.defaultInstance

private fun TestFieldOrderings.protoMergeImpl(plus: pbandk.Message?): TestFieldOrderings = (plus as? TestFieldOrderings)?.copy(
    myString = plus.myString ?: myString,
    myInt = plus.myInt ?: myInt,
    myFloat = plus.myFloat ?: myFloat,
    optionalNestedMessage = optionalNestedMessage?.plus(plus.optionalNestedMessage) ?: plus.optionalNestedMessage,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestFieldOrderings.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestFieldOrderings {
    var myString: String? = null
    var myInt: Long? = null
    var myFloat: Float? = null
    var optionalNestedMessage: pbandk.testpb.TestFieldOrderings.NestedMessage? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> myInt = _fieldValue as Long
            11 -> myString = _fieldValue as String
            101 -> myFloat = _fieldValue as Float
            200 -> optionalNestedMessage = _fieldValue as pbandk.testpb.TestFieldOrderings.NestedMessage
        }
    }
    return TestFieldOrderings(myString, myInt, myFloat, optionalNestedMessage, unknownFields)
}

fun TestFieldOrderings.NestedMessage?.orDefault() = this ?: TestFieldOrderings.NestedMessage.defaultInstance

private fun TestFieldOrderings.NestedMessage.protoMergeImpl(plus: pbandk.Message?): TestFieldOrderings.NestedMessage = (plus as? TestFieldOrderings.NestedMessage)?.copy(
    oo = plus.oo ?: oo,
    bb = plus.bb ?: bb,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestFieldOrderings.NestedMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestFieldOrderings.NestedMessage {
    var oo: Long? = null
    var bb: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> bb = _fieldValue as Int
            2 -> oo = _fieldValue as Long
        }
    }
    return TestFieldOrderings.NestedMessage(oo, bb, unknownFields)
}

fun TestExtensionOrderings1?.orDefault() = this ?: TestExtensionOrderings1.defaultInstance

private fun TestExtensionOrderings1.protoMergeImpl(plus: pbandk.Message?): TestExtensionOrderings1 = (plus as? TestExtensionOrderings1)?.copy(
    myString = plus.myString ?: myString,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestExtensionOrderings1.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestExtensionOrderings1 {
    var myString: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> myString = _fieldValue as String
        }
    }
    return TestExtensionOrderings1(myString, unknownFields)
}

fun TestExtensionOrderings2?.orDefault() = this ?: TestExtensionOrderings2.defaultInstance

private fun TestExtensionOrderings2.protoMergeImpl(plus: pbandk.Message?): TestExtensionOrderings2 = (plus as? TestExtensionOrderings2)?.copy(
    myString = plus.myString ?: myString,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestExtensionOrderings2.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestExtensionOrderings2 {
    var myString: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> myString = _fieldValue as String
        }
    }
    return TestExtensionOrderings2(myString, unknownFields)
}

fun TestExtensionOrderings2.TestExtensionOrderings3?.orDefault() = this ?: TestExtensionOrderings2.TestExtensionOrderings3.defaultInstance

private fun TestExtensionOrderings2.TestExtensionOrderings3.protoMergeImpl(plus: pbandk.Message?): TestExtensionOrderings2.TestExtensionOrderings3 = (plus as? TestExtensionOrderings2.TestExtensionOrderings3)?.copy(
    myString = plus.myString ?: myString,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestExtensionOrderings2.TestExtensionOrderings3.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestExtensionOrderings2.TestExtensionOrderings3 {
    var myString: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> myString = _fieldValue as String
        }
    }
    return TestExtensionOrderings2.TestExtensionOrderings3(myString, unknownFields)
}

fun TestExtremeDefaultValues?.orDefault() = this ?: TestExtremeDefaultValues.defaultInstance

private fun TestExtremeDefaultValues.protoMergeImpl(plus: pbandk.Message?): TestExtremeDefaultValues = (plus as? TestExtremeDefaultValues)?.copy(
    escapedBytes = plus.escapedBytes ?: escapedBytes,
    largeUint32 = plus.largeUint32 ?: largeUint32,
    largeUint64 = plus.largeUint64 ?: largeUint64,
    smallInt32 = plus.smallInt32 ?: smallInt32,
    smallInt64 = plus.smallInt64 ?: smallInt64,
    reallySmallInt32 = plus.reallySmallInt32 ?: reallySmallInt32,
    reallySmallInt64 = plus.reallySmallInt64 ?: reallySmallInt64,
    utf8String = plus.utf8String ?: utf8String,
    zeroFloat = plus.zeroFloat ?: zeroFloat,
    oneFloat = plus.oneFloat ?: oneFloat,
    smallFloat = plus.smallFloat ?: smallFloat,
    negativeOneFloat = plus.negativeOneFloat ?: negativeOneFloat,
    negativeFloat = plus.negativeFloat ?: negativeFloat,
    largeFloat = plus.largeFloat ?: largeFloat,
    smallNegativeFloat = plus.smallNegativeFloat ?: smallNegativeFloat,
    infDouble = plus.infDouble ?: infDouble,
    negInfDouble = plus.negInfDouble ?: negInfDouble,
    nanDouble = plus.nanDouble ?: nanDouble,
    infFloat = plus.infFloat ?: infFloat,
    negInfFloat = plus.negInfFloat ?: negInfFloat,
    nanFloat = plus.nanFloat ?: nanFloat,
    cppTrigraph = plus.cppTrigraph ?: cppTrigraph,
    stringWithZero = plus.stringWithZero ?: stringWithZero,
    bytesWithZero = plus.bytesWithZero ?: bytesWithZero,
    stringPieceWithZero = plus.stringPieceWithZero ?: stringPieceWithZero,
    cordWithZero = plus.cordWithZero ?: cordWithZero,
    replacementString = plus.replacementString ?: replacementString,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestExtremeDefaultValues.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestExtremeDefaultValues {
    var escapedBytes: pbandk.ByteArr? = null
    var largeUint32: Int? = null
    var largeUint64: Long? = null
    var smallInt32: Int? = null
    var smallInt64: Long? = null
    var reallySmallInt32: Int? = null
    var reallySmallInt64: Long? = null
    var utf8String: String? = null
    var zeroFloat: Float? = null
    var oneFloat: Float? = null
    var smallFloat: Float? = null
    var negativeOneFloat: Float? = null
    var negativeFloat: Float? = null
    var largeFloat: Float? = null
    var smallNegativeFloat: Float? = null
    var infDouble: Double? = null
    var negInfDouble: Double? = null
    var nanDouble: Double? = null
    var infFloat: Float? = null
    var negInfFloat: Float? = null
    var nanFloat: Float? = null
    var cppTrigraph: String? = null
    var stringWithZero: String? = null
    var bytesWithZero: pbandk.ByteArr? = null
    var stringPieceWithZero: String? = null
    var cordWithZero: String? = null
    var replacementString: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> escapedBytes = _fieldValue as pbandk.ByteArr
            2 -> largeUint32 = _fieldValue as Int
            3 -> largeUint64 = _fieldValue as Long
            4 -> smallInt32 = _fieldValue as Int
            5 -> smallInt64 = _fieldValue as Long
            6 -> utf8String = _fieldValue as String
            7 -> zeroFloat = _fieldValue as Float
            8 -> oneFloat = _fieldValue as Float
            9 -> smallFloat = _fieldValue as Float
            10 -> negativeOneFloat = _fieldValue as Float
            11 -> negativeFloat = _fieldValue as Float
            12 -> largeFloat = _fieldValue as Float
            13 -> smallNegativeFloat = _fieldValue as Float
            14 -> infDouble = _fieldValue as Double
            15 -> negInfDouble = _fieldValue as Double
            16 -> nanDouble = _fieldValue as Double
            17 -> infFloat = _fieldValue as Float
            18 -> negInfFloat = _fieldValue as Float
            19 -> nanFloat = _fieldValue as Float
            20 -> cppTrigraph = _fieldValue as String
            21 -> reallySmallInt32 = _fieldValue as Int
            22 -> reallySmallInt64 = _fieldValue as Long
            23 -> stringWithZero = _fieldValue as String
            24 -> bytesWithZero = _fieldValue as pbandk.ByteArr
            25 -> stringPieceWithZero = _fieldValue as String
            26 -> cordWithZero = _fieldValue as String
            27 -> replacementString = _fieldValue as String
        }
    }
    return TestExtremeDefaultValues(escapedBytes, largeUint32, largeUint64, smallInt32,
        smallInt64, reallySmallInt32, reallySmallInt64, utf8String,
        zeroFloat, oneFloat, smallFloat, negativeOneFloat,
        negativeFloat, largeFloat, smallNegativeFloat, infDouble,
        negInfDouble, nanDouble, infFloat, negInfFloat,
        nanFloat, cppTrigraph, stringWithZero, bytesWithZero,
        stringPieceWithZero, cordWithZero, replacementString, unknownFields)
}

fun SparseEnumMessage?.orDefault() = this ?: SparseEnumMessage.defaultInstance

private fun SparseEnumMessage.protoMergeImpl(plus: pbandk.Message?): SparseEnumMessage = (plus as? SparseEnumMessage)?.copy(
    sparseEnum = plus.sparseEnum ?: sparseEnum,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun SparseEnumMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SparseEnumMessage {
    var sparseEnum: pbandk.testpb.TestSparseEnum? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> sparseEnum = _fieldValue as pbandk.testpb.TestSparseEnum
        }
    }
    return SparseEnumMessage(sparseEnum, unknownFields)
}

fun OneString?.orDefault() = this ?: OneString.defaultInstance

private fun OneString.protoMergeImpl(plus: pbandk.Message?): OneString = (plus as? OneString)?.copy(
    data = plus.data ?: data,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun OneString.Companion.decodeWithImpl(u: pbandk.MessageDecoder): OneString {
    var data: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> data = _fieldValue as String
        }
    }
    return OneString(data, unknownFields)
}

fun MoreString?.orDefault() = this ?: MoreString.defaultInstance

private fun MoreString.protoMergeImpl(plus: pbandk.Message?): MoreString = (plus as? MoreString)?.copy(
    data = data + plus.data,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun MoreString.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MoreString {
    var data: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> data = (data ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }
    return MoreString(pbandk.ListWithSize.Builder.fixed(data), unknownFields)
}

fun OneBytes?.orDefault() = this ?: OneBytes.defaultInstance

private fun OneBytes.protoMergeImpl(plus: pbandk.Message?): OneBytes = (plus as? OneBytes)?.copy(
    data = plus.data ?: data,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun OneBytes.Companion.decodeWithImpl(u: pbandk.MessageDecoder): OneBytes {
    var data: pbandk.ByteArr? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> data = _fieldValue as pbandk.ByteArr
        }
    }
    return OneBytes(data, unknownFields)
}

fun MoreBytes?.orDefault() = this ?: MoreBytes.defaultInstance

private fun MoreBytes.protoMergeImpl(plus: pbandk.Message?): MoreBytes = (plus as? MoreBytes)?.copy(
    data = data + plus.data,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun MoreBytes.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MoreBytes {
    var data: pbandk.ListWithSize.Builder<pbandk.ByteArr>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> data = (data ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.ByteArr> }
        }
    }
    return MoreBytes(pbandk.ListWithSize.Builder.fixed(data), unknownFields)
}

fun Int32Message?.orDefault() = this ?: Int32Message.defaultInstance

private fun Int32Message.protoMergeImpl(plus: pbandk.Message?): Int32Message = (plus as? Int32Message)?.copy(
    data = plus.data ?: data,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Int32Message.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Int32Message {
    var data: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> data = _fieldValue as Int
        }
    }
    return Int32Message(data, unknownFields)
}

fun Uint32Message?.orDefault() = this ?: Uint32Message.defaultInstance

private fun Uint32Message.protoMergeImpl(plus: pbandk.Message?): Uint32Message = (plus as? Uint32Message)?.copy(
    data = plus.data ?: data,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Uint32Message.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Uint32Message {
    var data: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> data = _fieldValue as Int
        }
    }
    return Uint32Message(data, unknownFields)
}

fun Int64Message?.orDefault() = this ?: Int64Message.defaultInstance

private fun Int64Message.protoMergeImpl(plus: pbandk.Message?): Int64Message = (plus as? Int64Message)?.copy(
    data = plus.data ?: data,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Int64Message.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Int64Message {
    var data: Long? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> data = _fieldValue as Long
        }
    }
    return Int64Message(data, unknownFields)
}

fun Uint64Message?.orDefault() = this ?: Uint64Message.defaultInstance

private fun Uint64Message.protoMergeImpl(plus: pbandk.Message?): Uint64Message = (plus as? Uint64Message)?.copy(
    data = plus.data ?: data,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Uint64Message.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Uint64Message {
    var data: Long? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> data = _fieldValue as Long
        }
    }
    return Uint64Message(data, unknownFields)
}

fun BoolMessage?.orDefault() = this ?: BoolMessage.defaultInstance

private fun BoolMessage.protoMergeImpl(plus: pbandk.Message?): BoolMessage = (plus as? BoolMessage)?.copy(
    data = plus.data ?: data,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun BoolMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): BoolMessage {
    var data: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> data = _fieldValue as Boolean
        }
    }
    return BoolMessage(data, unknownFields)
}

fun TestOneof?.orDefault() = this ?: TestOneof.defaultInstance

private fun TestOneof.protoMergeImpl(plus: pbandk.Message?): TestOneof = (plus as? TestOneof)?.copy(
    foo = when {
        foo is TestOneof.Foo.FooMessage && plus.foo is TestOneof.Foo.FooMessage ->
            TestOneof.Foo.FooMessage(foo.value + plus.foo.value)
        else ->
            plus.foo ?: foo
    },
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestOneof.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestOneof {
    var foo: TestOneof.Foo<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> foo = TestOneof.Foo.FooInt(_fieldValue as Int)
            2 -> foo = TestOneof.Foo.FooString(_fieldValue as String)
            3 -> foo = TestOneof.Foo.FooMessage(_fieldValue as pbandk.testpb.TestAllTypes)
        }
    }
    return TestOneof(foo, unknownFields)
}

fun TestOneof.FooGroup?.orDefault() = this ?: TestOneof.FooGroup.defaultInstance

private fun TestOneof.FooGroup.protoMergeImpl(plus: pbandk.Message?): TestOneof.FooGroup = (plus as? TestOneof.FooGroup)?.copy(
    a = plus.a ?: a,
    b = plus.b ?: b,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestOneof.FooGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestOneof.FooGroup {
    var a: Int? = null
    var b: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            5 -> a = _fieldValue as Int
            6 -> b = _fieldValue as String
        }
    }
    return TestOneof.FooGroup(a, b, unknownFields)
}

fun TestOneofBackwardsCompatible?.orDefault() = this ?: TestOneofBackwardsCompatible.defaultInstance

private fun TestOneofBackwardsCompatible.protoMergeImpl(plus: pbandk.Message?): TestOneofBackwardsCompatible = (plus as? TestOneofBackwardsCompatible)?.copy(
    fooInt = plus.fooInt ?: fooInt,
    fooString = plus.fooString ?: fooString,
    fooMessage = fooMessage?.plus(plus.fooMessage) ?: plus.fooMessage,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestOneofBackwardsCompatible.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestOneofBackwardsCompatible {
    var fooInt: Int? = null
    var fooString: String? = null
    var fooMessage: pbandk.testpb.TestAllTypes? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fooInt = _fieldValue as Int
            2 -> fooString = _fieldValue as String
            3 -> fooMessage = _fieldValue as pbandk.testpb.TestAllTypes
        }
    }
    return TestOneofBackwardsCompatible(fooInt, fooString, fooMessage, unknownFields)
}

fun TestOneofBackwardsCompatible.FooGroup?.orDefault() = this ?: TestOneofBackwardsCompatible.FooGroup.defaultInstance

private fun TestOneofBackwardsCompatible.FooGroup.protoMergeImpl(plus: pbandk.Message?): TestOneofBackwardsCompatible.FooGroup = (plus as? TestOneofBackwardsCompatible.FooGroup)?.copy(
    a = plus.a ?: a,
    b = plus.b ?: b,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestOneofBackwardsCompatible.FooGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestOneofBackwardsCompatible.FooGroup {
    var a: Int? = null
    var b: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            5 -> a = _fieldValue as Int
            6 -> b = _fieldValue as String
        }
    }
    return TestOneofBackwardsCompatible.FooGroup(a, b, unknownFields)
}

fun TestOneof2?.orDefault() = this ?: TestOneof2.defaultInstance

private fun TestOneof2.protoMergeImpl(plus: pbandk.Message?): TestOneof2 = (plus as? TestOneof2)?.copy(
    bazInt = plus.bazInt ?: bazInt,
    bazString = plus.bazString ?: bazString,
    foo = when {
        foo is TestOneof2.Foo.FooMessage && plus.foo is TestOneof2.Foo.FooMessage ->
            TestOneof2.Foo.FooMessage(foo.value + plus.foo.value)
        foo is TestOneof2.Foo.FooLazyMessage && plus.foo is TestOneof2.Foo.FooLazyMessage ->
            TestOneof2.Foo.FooLazyMessage(foo.value + plus.foo.value)
        else ->
            plus.foo ?: foo
    },
    bar = plus.bar ?: bar,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestOneof2.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestOneof2 {
    var bazInt: Int? = null
    var bazString: String? = null
    var foo: TestOneof2.Foo<*>? = null
    var bar: TestOneof2.Bar<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> foo = TestOneof2.Foo.FooInt(_fieldValue as Int)
            2 -> foo = TestOneof2.Foo.FooString(_fieldValue as String)
            3 -> foo = TestOneof2.Foo.FooCord(_fieldValue as String)
            4 -> foo = TestOneof2.Foo.FooStringPiece(_fieldValue as String)
            5 -> foo = TestOneof2.Foo.FooBytes(_fieldValue as pbandk.ByteArr)
            6 -> foo = TestOneof2.Foo.FooEnum(_fieldValue as pbandk.testpb.TestOneof2.NestedEnum)
            7 -> foo = TestOneof2.Foo.FooMessage(_fieldValue as pbandk.testpb.TestOneof2.NestedMessage)
            11 -> foo = TestOneof2.Foo.FooLazyMessage(_fieldValue as pbandk.testpb.TestOneof2.NestedMessage)
            12 -> bar = TestOneof2.Bar.BarInt(_fieldValue as Int)
            13 -> bar = TestOneof2.Bar.BarString(_fieldValue as String)
            14 -> bar = TestOneof2.Bar.BarCord(_fieldValue as String)
            15 -> bar = TestOneof2.Bar.BarStringPiece(_fieldValue as String)
            16 -> bar = TestOneof2.Bar.BarBytes(_fieldValue as pbandk.ByteArr)
            17 -> bar = TestOneof2.Bar.BarEnum(_fieldValue as pbandk.testpb.TestOneof2.NestedEnum)
            18 -> bazInt = _fieldValue as Int
            19 -> bazString = _fieldValue as String
        }
    }
    return TestOneof2(bazInt, bazString, foo, bar, unknownFields)
}

fun TestOneof2.FooGroup?.orDefault() = this ?: TestOneof2.FooGroup.defaultInstance

private fun TestOneof2.FooGroup.protoMergeImpl(plus: pbandk.Message?): TestOneof2.FooGroup = (plus as? TestOneof2.FooGroup)?.copy(
    a = plus.a ?: a,
    b = plus.b ?: b,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestOneof2.FooGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestOneof2.FooGroup {
    var a: Int? = null
    var b: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            9 -> a = _fieldValue as Int
            10 -> b = _fieldValue as String
        }
    }
    return TestOneof2.FooGroup(a, b, unknownFields)
}

fun TestOneof2.NestedMessage?.orDefault() = this ?: TestOneof2.NestedMessage.defaultInstance

private fun TestOneof2.NestedMessage.protoMergeImpl(plus: pbandk.Message?): TestOneof2.NestedMessage = (plus as? TestOneof2.NestedMessage)?.copy(
    quxInt = plus.quxInt ?: quxInt,
    corgeInt = corgeInt + plus.corgeInt,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestOneof2.NestedMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestOneof2.NestedMessage {
    var quxInt: Long? = null
    var corgeInt: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> quxInt = _fieldValue as Long
            2 -> corgeInt = (corgeInt ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
        }
    }
    return TestOneof2.NestedMessage(quxInt, pbandk.ListWithSize.Builder.fixed(corgeInt), unknownFields)
}

fun TestRequiredOneof?.orDefault() = this ?: TestRequiredOneof.defaultInstance

private fun TestRequiredOneof.protoMergeImpl(plus: pbandk.Message?): TestRequiredOneof = (plus as? TestRequiredOneof)?.copy(
    foo = when {
        foo is TestRequiredOneof.Foo.FooMessage && plus.foo is TestRequiredOneof.Foo.FooMessage ->
            TestRequiredOneof.Foo.FooMessage(foo.value + plus.foo.value)
        else ->
            plus.foo ?: foo
    },
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestRequiredOneof.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestRequiredOneof {
    var foo: TestRequiredOneof.Foo<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> foo = TestRequiredOneof.Foo.FooInt(_fieldValue as Int)
            2 -> foo = TestRequiredOneof.Foo.FooString(_fieldValue as String)
            3 -> foo = TestRequiredOneof.Foo.FooMessage(_fieldValue as pbandk.testpb.TestRequiredOneof.NestedMessage)
        }
    }
    return TestRequiredOneof(foo, unknownFields)
}

fun TestRequiredOneof.NestedMessage?.orDefault() = this ?: TestRequiredOneof.NestedMessage.defaultInstance

private fun TestRequiredOneof.NestedMessage.protoMergeImpl(plus: pbandk.Message?): TestRequiredOneof.NestedMessage = (plus as? TestRequiredOneof.NestedMessage)?.copy(
    requiredDouble = plus.requiredDouble ?: requiredDouble,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestRequiredOneof.NestedMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestRequiredOneof.NestedMessage {
    var requiredDouble = 0.0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> requiredDouble = _fieldValue as Double
        }
    }
    return TestRequiredOneof.NestedMessage(requiredDouble, unknownFields)
}

fun TestPackedTypes?.orDefault() = this ?: TestPackedTypes.defaultInstance

private fun TestPackedTypes.protoMergeImpl(plus: pbandk.Message?): TestPackedTypes = (plus as? TestPackedTypes)?.copy(
    packedInt32 = packedInt32 + plus.packedInt32,
    packedInt64 = packedInt64 + plus.packedInt64,
    packedUint32 = packedUint32 + plus.packedUint32,
    packedUint64 = packedUint64 + plus.packedUint64,
    packedSint32 = packedSint32 + plus.packedSint32,
    packedSint64 = packedSint64 + plus.packedSint64,
    packedFixed32 = packedFixed32 + plus.packedFixed32,
    packedFixed64 = packedFixed64 + plus.packedFixed64,
    packedSfixed32 = packedSfixed32 + plus.packedSfixed32,
    packedSfixed64 = packedSfixed64 + plus.packedSfixed64,
    packedFloat = packedFloat + plus.packedFloat,
    packedDouble = packedDouble + plus.packedDouble,
    packedBool = packedBool + plus.packedBool,
    packedEnum = packedEnum + plus.packedEnum,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestPackedTypes.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestPackedTypes {
    var packedInt32: pbandk.ListWithSize.Builder<Int>? = null
    var packedInt64: pbandk.ListWithSize.Builder<Long>? = null
    var packedUint32: pbandk.ListWithSize.Builder<Int>? = null
    var packedUint64: pbandk.ListWithSize.Builder<Long>? = null
    var packedSint32: pbandk.ListWithSize.Builder<Int>? = null
    var packedSint64: pbandk.ListWithSize.Builder<Long>? = null
    var packedFixed32: pbandk.ListWithSize.Builder<Int>? = null
    var packedFixed64: pbandk.ListWithSize.Builder<Long>? = null
    var packedSfixed32: pbandk.ListWithSize.Builder<Int>? = null
    var packedSfixed64: pbandk.ListWithSize.Builder<Long>? = null
    var packedFloat: pbandk.ListWithSize.Builder<Float>? = null
    var packedDouble: pbandk.ListWithSize.Builder<Double>? = null
    var packedBool: pbandk.ListWithSize.Builder<Boolean>? = null
    var packedEnum: pbandk.ListWithSize.Builder<pbandk.testpb.ForeignEnum>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            90 -> packedInt32 = (packedInt32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            91 -> packedInt64 = (packedInt64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            92 -> packedUint32 = (packedUint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            93 -> packedUint64 = (packedUint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            94 -> packedSint32 = (packedSint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            95 -> packedSint64 = (packedSint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            96 -> packedFixed32 = (packedFixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            97 -> packedFixed64 = (packedFixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            98 -> packedSfixed32 = (packedSfixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            99 -> packedSfixed64 = (packedSfixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            100 -> packedFloat = (packedFloat ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            101 -> packedDouble = (packedDouble ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
            102 -> packedBool = (packedBool ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Boolean> }
            103 -> packedEnum = (packedEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.ForeignEnum> }
        }
    }
    return TestPackedTypes(pbandk.ListWithSize.Builder.fixed(packedInt32), pbandk.ListWithSize.Builder.fixed(packedInt64), pbandk.ListWithSize.Builder.fixed(packedUint32), pbandk.ListWithSize.Builder.fixed(packedUint64),
        pbandk.ListWithSize.Builder.fixed(packedSint32), pbandk.ListWithSize.Builder.fixed(packedSint64), pbandk.ListWithSize.Builder.fixed(packedFixed32), pbandk.ListWithSize.Builder.fixed(packedFixed64),
        pbandk.ListWithSize.Builder.fixed(packedSfixed32), pbandk.ListWithSize.Builder.fixed(packedSfixed64), pbandk.ListWithSize.Builder.fixed(packedFloat), pbandk.ListWithSize.Builder.fixed(packedDouble),
        pbandk.ListWithSize.Builder.fixed(packedBool), pbandk.ListWithSize.Builder.fixed(packedEnum), unknownFields)
}

fun TestUnpackedTypes?.orDefault() = this ?: TestUnpackedTypes.defaultInstance

private fun TestUnpackedTypes.protoMergeImpl(plus: pbandk.Message?): TestUnpackedTypes = (plus as? TestUnpackedTypes)?.copy(
    unpackedInt32 = unpackedInt32 + plus.unpackedInt32,
    unpackedInt64 = unpackedInt64 + plus.unpackedInt64,
    unpackedUint32 = unpackedUint32 + plus.unpackedUint32,
    unpackedUint64 = unpackedUint64 + plus.unpackedUint64,
    unpackedSint32 = unpackedSint32 + plus.unpackedSint32,
    unpackedSint64 = unpackedSint64 + plus.unpackedSint64,
    unpackedFixed32 = unpackedFixed32 + plus.unpackedFixed32,
    unpackedFixed64 = unpackedFixed64 + plus.unpackedFixed64,
    unpackedSfixed32 = unpackedSfixed32 + plus.unpackedSfixed32,
    unpackedSfixed64 = unpackedSfixed64 + plus.unpackedSfixed64,
    unpackedFloat = unpackedFloat + plus.unpackedFloat,
    unpackedDouble = unpackedDouble + plus.unpackedDouble,
    unpackedBool = unpackedBool + plus.unpackedBool,
    unpackedEnum = unpackedEnum + plus.unpackedEnum,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestUnpackedTypes.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestUnpackedTypes {
    var unpackedInt32: pbandk.ListWithSize.Builder<Int>? = null
    var unpackedInt64: pbandk.ListWithSize.Builder<Long>? = null
    var unpackedUint32: pbandk.ListWithSize.Builder<Int>? = null
    var unpackedUint64: pbandk.ListWithSize.Builder<Long>? = null
    var unpackedSint32: pbandk.ListWithSize.Builder<Int>? = null
    var unpackedSint64: pbandk.ListWithSize.Builder<Long>? = null
    var unpackedFixed32: pbandk.ListWithSize.Builder<Int>? = null
    var unpackedFixed64: pbandk.ListWithSize.Builder<Long>? = null
    var unpackedSfixed32: pbandk.ListWithSize.Builder<Int>? = null
    var unpackedSfixed64: pbandk.ListWithSize.Builder<Long>? = null
    var unpackedFloat: pbandk.ListWithSize.Builder<Float>? = null
    var unpackedDouble: pbandk.ListWithSize.Builder<Double>? = null
    var unpackedBool: pbandk.ListWithSize.Builder<Boolean>? = null
    var unpackedEnum: pbandk.ListWithSize.Builder<pbandk.testpb.ForeignEnum>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            90 -> unpackedInt32 = (unpackedInt32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            91 -> unpackedInt64 = (unpackedInt64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            92 -> unpackedUint32 = (unpackedUint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            93 -> unpackedUint64 = (unpackedUint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            94 -> unpackedSint32 = (unpackedSint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            95 -> unpackedSint64 = (unpackedSint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            96 -> unpackedFixed32 = (unpackedFixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            97 -> unpackedFixed64 = (unpackedFixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            98 -> unpackedSfixed32 = (unpackedSfixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            99 -> unpackedSfixed64 = (unpackedSfixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            100 -> unpackedFloat = (unpackedFloat ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            101 -> unpackedDouble = (unpackedDouble ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
            102 -> unpackedBool = (unpackedBool ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Boolean> }
            103 -> unpackedEnum = (unpackedEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.ForeignEnum> }
        }
    }
    return TestUnpackedTypes(pbandk.ListWithSize.Builder.fixed(unpackedInt32), pbandk.ListWithSize.Builder.fixed(unpackedInt64), pbandk.ListWithSize.Builder.fixed(unpackedUint32), pbandk.ListWithSize.Builder.fixed(unpackedUint64),
        pbandk.ListWithSize.Builder.fixed(unpackedSint32), pbandk.ListWithSize.Builder.fixed(unpackedSint64), pbandk.ListWithSize.Builder.fixed(unpackedFixed32), pbandk.ListWithSize.Builder.fixed(unpackedFixed64),
        pbandk.ListWithSize.Builder.fixed(unpackedSfixed32), pbandk.ListWithSize.Builder.fixed(unpackedSfixed64), pbandk.ListWithSize.Builder.fixed(unpackedFloat), pbandk.ListWithSize.Builder.fixed(unpackedDouble),
        pbandk.ListWithSize.Builder.fixed(unpackedBool), pbandk.ListWithSize.Builder.fixed(unpackedEnum), unknownFields)
}

fun TestPackedExtensions?.orDefault() = this ?: TestPackedExtensions.defaultInstance

private fun TestPackedExtensions.protoMergeImpl(plus: pbandk.Message?): TestPackedExtensions = (plus as? TestPackedExtensions)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestPackedExtensions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestPackedExtensions {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return TestPackedExtensions(unknownFields)
}

fun TestUnpackedExtensions?.orDefault() = this ?: TestUnpackedExtensions.defaultInstance

private fun TestUnpackedExtensions.protoMergeImpl(plus: pbandk.Message?): TestUnpackedExtensions = (plus as? TestUnpackedExtensions)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestUnpackedExtensions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestUnpackedExtensions {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return TestUnpackedExtensions(unknownFields)
}

fun TestDynamicExtensions?.orDefault() = this ?: TestDynamicExtensions.defaultInstance

private fun TestDynamicExtensions.protoMergeImpl(plus: pbandk.Message?): TestDynamicExtensions = (plus as? TestDynamicExtensions)?.copy(
    scalarExtension = plus.scalarExtension ?: scalarExtension,
    enumExtension = plus.enumExtension ?: enumExtension,
    dynamicEnumExtension = plus.dynamicEnumExtension ?: dynamicEnumExtension,
    messageExtension = messageExtension?.plus(plus.messageExtension) ?: plus.messageExtension,
    dynamicMessageExtension = dynamicMessageExtension?.plus(plus.dynamicMessageExtension) ?: plus.dynamicMessageExtension,
    repeatedExtension = repeatedExtension + plus.repeatedExtension,
    packedExtension = packedExtension + plus.packedExtension,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestDynamicExtensions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestDynamicExtensions {
    var scalarExtension: Int? = null
    var enumExtension: pbandk.testpb.ForeignEnum? = null
    var dynamicEnumExtension: pbandk.testpb.TestDynamicExtensions.DynamicEnumType? = null
    var messageExtension: pbandk.testpb.ForeignMessage? = null
    var dynamicMessageExtension: pbandk.testpb.TestDynamicExtensions.DynamicMessageType? = null
    var repeatedExtension: pbandk.ListWithSize.Builder<String>? = null
    var packedExtension: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            2000 -> scalarExtension = _fieldValue as Int
            2001 -> enumExtension = _fieldValue as pbandk.testpb.ForeignEnum
            2002 -> dynamicEnumExtension = _fieldValue as pbandk.testpb.TestDynamicExtensions.DynamicEnumType
            2003 -> messageExtension = _fieldValue as pbandk.testpb.ForeignMessage
            2004 -> dynamicMessageExtension = _fieldValue as pbandk.testpb.TestDynamicExtensions.DynamicMessageType
            2005 -> repeatedExtension = (repeatedExtension ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            2006 -> packedExtension = (packedExtension ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
        }
    }
    return TestDynamicExtensions(scalarExtension, enumExtension, dynamicEnumExtension, messageExtension,
        dynamicMessageExtension, pbandk.ListWithSize.Builder.fixed(repeatedExtension), pbandk.ListWithSize.Builder.fixed(packedExtension), unknownFields)
}

fun TestDynamicExtensions.DynamicMessageType?.orDefault() = this ?: TestDynamicExtensions.DynamicMessageType.defaultInstance

private fun TestDynamicExtensions.DynamicMessageType.protoMergeImpl(plus: pbandk.Message?): TestDynamicExtensions.DynamicMessageType = (plus as? TestDynamicExtensions.DynamicMessageType)?.copy(
    dynamicField = plus.dynamicField ?: dynamicField,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestDynamicExtensions.DynamicMessageType.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestDynamicExtensions.DynamicMessageType {
    var dynamicField: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            2100 -> dynamicField = _fieldValue as Int
        }
    }
    return TestDynamicExtensions.DynamicMessageType(dynamicField, unknownFields)
}

fun TestRepeatedScalarDifferentTagSizes?.orDefault() = this ?: TestRepeatedScalarDifferentTagSizes.defaultInstance

private fun TestRepeatedScalarDifferentTagSizes.protoMergeImpl(plus: pbandk.Message?): TestRepeatedScalarDifferentTagSizes = (plus as? TestRepeatedScalarDifferentTagSizes)?.copy(
    repeatedFixed32 = repeatedFixed32 + plus.repeatedFixed32,
    repeatedInt32 = repeatedInt32 + plus.repeatedInt32,
    repeatedFixed64 = repeatedFixed64 + plus.repeatedFixed64,
    repeatedInt64 = repeatedInt64 + plus.repeatedInt64,
    repeatedFloat = repeatedFloat + plus.repeatedFloat,
    repeatedUint64 = repeatedUint64 + plus.repeatedUint64,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestRepeatedScalarDifferentTagSizes.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestRepeatedScalarDifferentTagSizes {
    var repeatedFixed32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedInt32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedFixed64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedInt64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedFloat: pbandk.ListWithSize.Builder<Float>? = null
    var repeatedUint64: pbandk.ListWithSize.Builder<Long>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            12 -> repeatedFixed32 = (repeatedFixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            13 -> repeatedInt32 = (repeatedInt32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            2046 -> repeatedFixed64 = (repeatedFixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            2047 -> repeatedInt64 = (repeatedInt64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            262142 -> repeatedFloat = (repeatedFloat ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            262143 -> repeatedUint64 = (repeatedUint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
        }
    }
    return TestRepeatedScalarDifferentTagSizes(pbandk.ListWithSize.Builder.fixed(repeatedFixed32), pbandk.ListWithSize.Builder.fixed(repeatedInt32), pbandk.ListWithSize.Builder.fixed(repeatedFixed64), pbandk.ListWithSize.Builder.fixed(repeatedInt64),
        pbandk.ListWithSize.Builder.fixed(repeatedFloat), pbandk.ListWithSize.Builder.fixed(repeatedUint64), unknownFields)
}

fun TestParsingMerge?.orDefault() = this ?: TestParsingMerge.defaultInstance

private fun TestParsingMerge.protoMergeImpl(plus: pbandk.Message?): TestParsingMerge = (plus as? TestParsingMerge)?.copy(
    requiredAllTypes = requiredAllTypes?.plus(plus.requiredAllTypes) ?: plus.requiredAllTypes,
    optionalAllTypes = optionalAllTypes?.plus(plus.optionalAllTypes) ?: plus.optionalAllTypes,
    repeatedAllTypes = repeatedAllTypes + plus.repeatedAllTypes,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestParsingMerge.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestParsingMerge {
    var requiredAllTypes: pbandk.testpb.TestAllTypes? = null
    var optionalAllTypes: pbandk.testpb.TestAllTypes? = null
    var repeatedAllTypes: pbandk.ListWithSize.Builder<pbandk.testpb.TestAllTypes>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> requiredAllTypes = _fieldValue as pbandk.testpb.TestAllTypes
            2 -> optionalAllTypes = _fieldValue as pbandk.testpb.TestAllTypes
            3 -> repeatedAllTypes = (repeatedAllTypes ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestAllTypes> }
        }
    }
    return TestParsingMerge(requiredAllTypes, optionalAllTypes, pbandk.ListWithSize.Builder.fixed(repeatedAllTypes), unknownFields)
}

fun TestParsingMerge.RepeatedFieldsGenerator?.orDefault() = this ?: TestParsingMerge.RepeatedFieldsGenerator.defaultInstance

private fun TestParsingMerge.RepeatedFieldsGenerator.protoMergeImpl(plus: pbandk.Message?): TestParsingMerge.RepeatedFieldsGenerator = (plus as? TestParsingMerge.RepeatedFieldsGenerator)?.copy(
    field1 = field1 + plus.field1,
    field2 = field2 + plus.field2,
    field3 = field3 + plus.field3,
    ext1 = ext1 + plus.ext1,
    ext2 = ext2 + plus.ext2,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestParsingMerge.RepeatedFieldsGenerator.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestParsingMerge.RepeatedFieldsGenerator {
    var field1: pbandk.ListWithSize.Builder<pbandk.testpb.TestAllTypes>? = null
    var field2: pbandk.ListWithSize.Builder<pbandk.testpb.TestAllTypes>? = null
    var field3: pbandk.ListWithSize.Builder<pbandk.testpb.TestAllTypes>? = null
    var ext1: pbandk.ListWithSize.Builder<pbandk.testpb.TestAllTypes>? = null
    var ext2: pbandk.ListWithSize.Builder<pbandk.testpb.TestAllTypes>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> field1 = (field1 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestAllTypes> }
            2 -> field2 = (field2 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestAllTypes> }
            3 -> field3 = (field3 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestAllTypes> }
            1000 -> ext1 = (ext1 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestAllTypes> }
            1001 -> ext2 = (ext2 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestAllTypes> }
        }
    }
    return TestParsingMerge.RepeatedFieldsGenerator(pbandk.ListWithSize.Builder.fixed(field1), pbandk.ListWithSize.Builder.fixed(field2), pbandk.ListWithSize.Builder.fixed(field3), pbandk.ListWithSize.Builder.fixed(ext1),
        pbandk.ListWithSize.Builder.fixed(ext2), unknownFields)
}

fun TestParsingMerge.RepeatedFieldsGenerator.Group1?.orDefault() = this ?: TestParsingMerge.RepeatedFieldsGenerator.Group1.defaultInstance

private fun TestParsingMerge.RepeatedFieldsGenerator.Group1.protoMergeImpl(plus: pbandk.Message?): TestParsingMerge.RepeatedFieldsGenerator.Group1 = (plus as? TestParsingMerge.RepeatedFieldsGenerator.Group1)?.copy(
    field1 = field1?.plus(plus.field1) ?: plus.field1,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestParsingMerge.RepeatedFieldsGenerator.Group1.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestParsingMerge.RepeatedFieldsGenerator.Group1 {
    var field1: pbandk.testpb.TestAllTypes? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            11 -> field1 = _fieldValue as pbandk.testpb.TestAllTypes
        }
    }
    return TestParsingMerge.RepeatedFieldsGenerator.Group1(field1, unknownFields)
}

fun TestParsingMerge.RepeatedFieldsGenerator.Group2?.orDefault() = this ?: TestParsingMerge.RepeatedFieldsGenerator.Group2.defaultInstance

private fun TestParsingMerge.RepeatedFieldsGenerator.Group2.protoMergeImpl(plus: pbandk.Message?): TestParsingMerge.RepeatedFieldsGenerator.Group2 = (plus as? TestParsingMerge.RepeatedFieldsGenerator.Group2)?.copy(
    field1 = field1?.plus(plus.field1) ?: plus.field1,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestParsingMerge.RepeatedFieldsGenerator.Group2.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestParsingMerge.RepeatedFieldsGenerator.Group2 {
    var field1: pbandk.testpb.TestAllTypes? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            21 -> field1 = _fieldValue as pbandk.testpb.TestAllTypes
        }
    }
    return TestParsingMerge.RepeatedFieldsGenerator.Group2(field1, unknownFields)
}

fun TestParsingMerge.OptionalGroup?.orDefault() = this ?: TestParsingMerge.OptionalGroup.defaultInstance

private fun TestParsingMerge.OptionalGroup.protoMergeImpl(plus: pbandk.Message?): TestParsingMerge.OptionalGroup = (plus as? TestParsingMerge.OptionalGroup)?.copy(
    optionalGroupAllTypes = optionalGroupAllTypes?.plus(plus.optionalGroupAllTypes) ?: plus.optionalGroupAllTypes,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestParsingMerge.OptionalGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestParsingMerge.OptionalGroup {
    var optionalGroupAllTypes: pbandk.testpb.TestAllTypes? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            11 -> optionalGroupAllTypes = _fieldValue as pbandk.testpb.TestAllTypes
        }
    }
    return TestParsingMerge.OptionalGroup(optionalGroupAllTypes, unknownFields)
}

fun TestParsingMerge.RepeatedGroup?.orDefault() = this ?: TestParsingMerge.RepeatedGroup.defaultInstance

private fun TestParsingMerge.RepeatedGroup.protoMergeImpl(plus: pbandk.Message?): TestParsingMerge.RepeatedGroup = (plus as? TestParsingMerge.RepeatedGroup)?.copy(
    repeatedGroupAllTypes = repeatedGroupAllTypes?.plus(plus.repeatedGroupAllTypes) ?: plus.repeatedGroupAllTypes,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestParsingMerge.RepeatedGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestParsingMerge.RepeatedGroup {
    var repeatedGroupAllTypes: pbandk.testpb.TestAllTypes? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            21 -> repeatedGroupAllTypes = _fieldValue as pbandk.testpb.TestAllTypes
        }
    }
    return TestParsingMerge.RepeatedGroup(repeatedGroupAllTypes, unknownFields)
}

fun TestCommentInjectionMessage?.orDefault() = this ?: TestCommentInjectionMessage.defaultInstance

private fun TestCommentInjectionMessage.protoMergeImpl(plus: pbandk.Message?): TestCommentInjectionMessage = (plus as? TestCommentInjectionMessage)?.copy(
    a = plus.a ?: a,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestCommentInjectionMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestCommentInjectionMessage {
    var a: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> a = _fieldValue as String
        }
    }
    return TestCommentInjectionMessage(a, unknownFields)
}

fun FooRequest?.orDefault() = this ?: FooRequest.defaultInstance

private fun FooRequest.protoMergeImpl(plus: pbandk.Message?): FooRequest = (plus as? FooRequest)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FooRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooRequest {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return FooRequest(unknownFields)
}

fun FooResponse?.orDefault() = this ?: FooResponse.defaultInstance

private fun FooResponse.protoMergeImpl(plus: pbandk.Message?): FooResponse = (plus as? FooResponse)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FooResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooResponse {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return FooResponse(unknownFields)
}

fun FooClientMessage?.orDefault() = this ?: FooClientMessage.defaultInstance

private fun FooClientMessage.protoMergeImpl(plus: pbandk.Message?): FooClientMessage = (plus as? FooClientMessage)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FooClientMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooClientMessage {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return FooClientMessage(unknownFields)
}

fun FooServerMessage?.orDefault() = this ?: FooServerMessage.defaultInstance

private fun FooServerMessage.protoMergeImpl(plus: pbandk.Message?): FooServerMessage = (plus as? FooServerMessage)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FooServerMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooServerMessage {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return FooServerMessage(unknownFields)
}

fun BarRequest?.orDefault() = this ?: BarRequest.defaultInstance

private fun BarRequest.protoMergeImpl(plus: pbandk.Message?): BarRequest = (plus as? BarRequest)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun BarRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): BarRequest {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return BarRequest(unknownFields)
}

fun BarResponse?.orDefault() = this ?: BarResponse.defaultInstance

private fun BarResponse.protoMergeImpl(plus: pbandk.Message?): BarResponse = (plus as? BarResponse)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun BarResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): BarResponse {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return BarResponse(unknownFields)
}

fun TestJsonName?.orDefault() = this ?: TestJsonName.defaultInstance

private fun TestJsonName.protoMergeImpl(plus: pbandk.Message?): TestJsonName = (plus as? TestJsonName)?.copy(
    fieldName1 = plus.fieldName1 ?: fieldName1,
    fieldName2 = plus.fieldName2 ?: fieldName2,
    fieldName3 = plus.fieldName3 ?: fieldName3,
    fieldName4 = plus.fieldName4 ?: fieldName4,
    fIELDNAME5 = plus.fIELDNAME5 ?: fIELDNAME5,
    fieldName6 = plus.fieldName6 ?: fieldName6,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestJsonName.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestJsonName {
    var fieldName1: Int? = null
    var fieldName2: Int? = null
    var fieldName3: Int? = null
    var fieldName4: Int? = null
    var fIELDNAME5: Int? = null
    var fieldName6: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fieldName1 = _fieldValue as Int
            2 -> fieldName2 = _fieldValue as Int
            3 -> fieldName3 = _fieldValue as Int
            4 -> fieldName4 = _fieldValue as Int
            5 -> fIELDNAME5 = _fieldValue as Int
            6 -> fieldName6 = _fieldValue as Int
        }
    }
    return TestJsonName(fieldName1, fieldName2, fieldName3, fieldName4,
        fIELDNAME5, fieldName6, unknownFields)
}

fun TestHugeFieldNumbers?.orDefault() = this ?: TestHugeFieldNumbers.defaultInstance

private fun TestHugeFieldNumbers.protoMergeImpl(plus: pbandk.Message?): TestHugeFieldNumbers = (plus as? TestHugeFieldNumbers)?.copy(
    optionalInt32 = plus.optionalInt32 ?: optionalInt32,
    fixed32 = plus.fixed32 ?: fixed32,
    repeatedInt32 = repeatedInt32 + plus.repeatedInt32,
    packedInt32 = packedInt32 + plus.packedInt32,
    optionalEnum = plus.optionalEnum ?: optionalEnum,
    optionalString = plus.optionalString ?: optionalString,
    optionalBytes = plus.optionalBytes ?: optionalBytes,
    optionalMessage = optionalMessage?.plus(plus.optionalMessage) ?: plus.optionalMessage,
    stringStringMap = stringStringMap + plus.stringStringMap,
    oneofField = when {
        oneofField is TestHugeFieldNumbers.OneofField.OneofTestAllTypes && plus.oneofField is TestHugeFieldNumbers.OneofField.OneofTestAllTypes ->
            TestHugeFieldNumbers.OneofField.OneofTestAllTypes(oneofField.value + plus.oneofField.value)
        else ->
            plus.oneofField ?: oneofField
    },
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestHugeFieldNumbers.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestHugeFieldNumbers {
    var optionalInt32: Int? = null
    var fixed32: Int? = null
    var repeatedInt32: pbandk.ListWithSize.Builder<Int>? = null
    var packedInt32: pbandk.ListWithSize.Builder<Int>? = null
    var optionalEnum: pbandk.testpb.ForeignEnum? = null
    var optionalString: String? = null
    var optionalBytes: pbandk.ByteArr? = null
    var optionalMessage: pbandk.testpb.ForeignMessage? = null
    var stringStringMap: pbandk.MessageMap.Builder<String?, String?>? = null
    var oneofField: TestHugeFieldNumbers.OneofField<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            536870000 -> optionalInt32 = _fieldValue as Int
            536870001 -> fixed32 = _fieldValue as Int
            536870002 -> repeatedInt32 = (repeatedInt32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            536870003 -> packedInt32 = (packedInt32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            536870004 -> optionalEnum = _fieldValue as pbandk.testpb.ForeignEnum
            536870005 -> optionalString = _fieldValue as String
            536870006 -> optionalBytes = _fieldValue as pbandk.ByteArr
            536870007 -> optionalMessage = _fieldValue as pbandk.testpb.ForeignMessage
            536870010 -> stringStringMap = (stringStringMap ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String?, String?>> }
            536870011 -> oneofField = TestHugeFieldNumbers.OneofField.OneofUint32(_fieldValue as Int)
            536870012 -> oneofField = TestHugeFieldNumbers.OneofField.OneofTestAllTypes(_fieldValue as pbandk.testpb.TestAllTypes)
            536870013 -> oneofField = TestHugeFieldNumbers.OneofField.OneofString(_fieldValue as String)
            536870014 -> oneofField = TestHugeFieldNumbers.OneofField.OneofBytes(_fieldValue as pbandk.ByteArr)
        }
    }
    return TestHugeFieldNumbers(optionalInt32, fixed32, pbandk.ListWithSize.Builder.fixed(repeatedInt32), pbandk.ListWithSize.Builder.fixed(packedInt32),
        optionalEnum, optionalString, optionalBytes, optionalMessage,
        pbandk.MessageMap.Builder.fixed(stringStringMap), oneofField, unknownFields)
}

fun TestHugeFieldNumbers.OptionalGroup?.orDefault() = this ?: TestHugeFieldNumbers.OptionalGroup.defaultInstance

private fun TestHugeFieldNumbers.OptionalGroup.protoMergeImpl(plus: pbandk.Message?): TestHugeFieldNumbers.OptionalGroup = (plus as? TestHugeFieldNumbers.OptionalGroup)?.copy(
    groupA = plus.groupA ?: groupA,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestHugeFieldNumbers.OptionalGroup.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestHugeFieldNumbers.OptionalGroup {
    var groupA: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            536870009 -> groupA = _fieldValue as Int
        }
    }
    return TestHugeFieldNumbers.OptionalGroup(groupA, unknownFields)
}

fun TestHugeFieldNumbers.StringStringMapEntry?.orDefault() = this ?: TestHugeFieldNumbers.StringStringMapEntry.defaultInstance

private fun TestHugeFieldNumbers.StringStringMapEntry.protoMergeImpl(plus: pbandk.Message?): TestHugeFieldNumbers.StringStringMapEntry = (plus as? TestHugeFieldNumbers.StringStringMapEntry)?.copy(
    key = plus.key ?: key,
    value = plus.value ?: value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestHugeFieldNumbers.StringStringMapEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestHugeFieldNumbers.StringStringMapEntry {
    var key: String? = null
    var value: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }
    return TestHugeFieldNumbers.StringStringMapEntry(key, value, unknownFields)
}

fun TestExtensionInsideTable?.orDefault() = this ?: TestExtensionInsideTable.defaultInstance

private fun TestExtensionInsideTable.protoMergeImpl(plus: pbandk.Message?): TestExtensionInsideTable = (plus as? TestExtensionInsideTable)?.copy(
    field1 = plus.field1 ?: field1,
    field2 = plus.field2 ?: field2,
    field3 = plus.field3 ?: field3,
    field4 = plus.field4 ?: field4,
    field6 = plus.field6 ?: field6,
    field7 = plus.field7 ?: field7,
    field8 = plus.field8 ?: field8,
    field9 = plus.field9 ?: field9,
    field10 = plus.field10 ?: field10,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun TestExtensionInsideTable.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestExtensionInsideTable {
    var field1: Int? = null
    var field2: Int? = null
    var field3: Int? = null
    var field4: Int? = null
    var field6: Int? = null
    var field7: Int? = null
    var field8: Int? = null
    var field9: Int? = null
    var field10: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> field1 = _fieldValue as Int
            2 -> field2 = _fieldValue as Int
            3 -> field3 = _fieldValue as Int
            4 -> field4 = _fieldValue as Int
            6 -> field6 = _fieldValue as Int
            7 -> field7 = _fieldValue as Int
            8 -> field8 = _fieldValue as Int
            9 -> field9 = _fieldValue as Int
            10 -> field10 = _fieldValue as Int
        }
    }
    return TestExtensionInsideTable(field1, field2, field3, field4,
        field6, field7, field8, field9,
        field10, unknownFields)
}
