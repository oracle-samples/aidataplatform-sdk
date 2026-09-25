# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyEntity(object):
    """
    Flat ontology entity JSON for design-time ontology editing.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyEntity object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param entity_type:
            The value to assign to the entity_type property of this OntologyEntity.
        :type entity_type: str

        :param compact_iri:
            The value to assign to the compact_iri property of this OntologyEntity.
        :type compact_iri: str

        :param iri:
            The value to assign to the iri property of this OntologyEntity.
        :type iri: str

        :param path:
            The value to assign to the path property of this OntologyEntity.
        :type path: str

        :param label:
            The value to assign to the label property of this OntologyEntity.
        :type label: str

        :param comment:
            The value to assign to the comment property of this OntologyEntity.
        :type comment: str

        :param description:
            The value to assign to the description property of this OntologyEntity.
        :type description: str

        :param pref_label:
            The value to assign to the pref_label property of this OntologyEntity.
        :type pref_label: str

        :param definition:
            The value to assign to the definition property of this OntologyEntity.
        :type definition: str

        :param scope_notes:
            The value to assign to the scope_notes property of this OntologyEntity.
        :type scope_notes: str

        :param alt_labels:
            The value to assign to the alt_labels property of this OntologyEntity.
        :type alt_labels: list[str]

        :param synonyms:
            The value to assign to the synonyms property of this OntologyEntity.
        :type synonyms: list[str]

        :param version_info:
            The value to assign to the version_info property of this OntologyEntity.
        :type version_info: str

        :param default_prefix:
            The value to assign to the default_prefix property of this OntologyEntity.
        :type default_prefix: str

        :param prefix:
            The value to assign to the prefix property of this OntologyEntity.
        :type prefix: dict(str, str)

        :param imports:
            The value to assign to the imports property of this OntologyEntity.
        :type imports: list[str]

        :param sub_class_of:
            The value to assign to the sub_class_of property of this OntologyEntity.
        :type sub_class_of: list[str]

        :param equivalent_classes:
            The value to assign to the equivalent_classes property of this OntologyEntity.
        :type equivalent_classes: list[str]

        :param disjoint_with:
            The value to assign to the disjoint_with property of this OntologyEntity.
        :type disjoint_with: list[str]

        :param related_classes:
            The value to assign to the related_classes property of this OntologyEntity.
        :type related_classes: list[str]

        :param entity_role:
            The value to assign to the entity_role property of this OntologyEntity.
        :type entity_role: str

        :param grain_key:
            The value to assign to the grain_key property of this OntologyEntity.
        :type grain_key: list[str]

        :param measure_group:
            The value to assign to the measure_group property of this OntologyEntity.
        :type measure_group: str

        :param bi_subject_area:
            The value to assign to the bi_subject_area property of this OntologyEntity.
        :type bi_subject_area: str

        :param bi_subject_area_table:
            The value to assign to the bi_subject_area_table property of this OntologyEntity.
        :type bi_subject_area_table: str

        :param property_type:
            The value to assign to the property_type property of this OntologyEntity.
        :type property_type: str

        :param data_type:
            The value to assign to the data_type property of this OntologyEntity.
        :type data_type: str

        :param mapped_column:
            The value to assign to the mapped_column property of this OntologyEntity.
        :type mapped_column: str

        :param domain:
            The value to assign to the domain property of this OntologyEntity.
        :type domain: str

        :param range:
            The value to assign to the range property of this OntologyEntity.
        :type range: str

        :param cardinality:
            The value to assign to the cardinality property of this OntologyEntity.
        :type cardinality: oci.aidataplatform_dp.models.OntologyEntityCardinality

        :param sub_property_of:
            The value to assign to the sub_property_of property of this OntologyEntity.
        :type sub_property_of: list[str]

        :param inverse_of:
            The value to assign to the inverse_of property of this OntologyEntity.
        :type inverse_of: str

        :param owl_characteristics:
            The value to assign to the owl_characteristics property of this OntologyEntity.
        :type owl_characteristics: list[str]

        :param properties:
            The value to assign to the properties property of this OntologyEntity.
        :type properties: list[object]

        :param constraints:
            The value to assign to the constraints property of this OntologyEntity.
        :type constraints: list[object]

        :param binding:
            The value to assign to the binding property of this OntologyEntity.
        :type binding: list[object]

        :param relationships:
            The value to assign to the relationships property of this OntologyEntity.
        :type relationships: list[object]

        :param join_backed_mapping:
            The value to assign to the join_backed_mapping property of this OntologyEntity.
        :type join_backed_mapping: list[object]

        """
        self.swagger_types = {
            'entity_type': 'str',
            'compact_iri': 'str',
            'iri': 'str',
            'path': 'str',
            'label': 'str',
            'comment': 'str',
            'description': 'str',
            'pref_label': 'str',
            'definition': 'str',
            'scope_notes': 'str',
            'alt_labels': 'list[str]',
            'synonyms': 'list[str]',
            'version_info': 'str',
            'default_prefix': 'str',
            'prefix': 'dict(str, str)',
            'imports': 'list[str]',
            'sub_class_of': 'list[str]',
            'equivalent_classes': 'list[str]',
            'disjoint_with': 'list[str]',
            'related_classes': 'list[str]',
            'entity_role': 'str',
            'grain_key': 'list[str]',
            'measure_group': 'str',
            'bi_subject_area': 'str',
            'bi_subject_area_table': 'str',
            'property_type': 'str',
            'data_type': 'str',
            'mapped_column': 'str',
            'domain': 'str',
            'range': 'str',
            'cardinality': 'OntologyEntityCardinality',
            'sub_property_of': 'list[str]',
            'inverse_of': 'str',
            'owl_characteristics': 'list[str]',
            'properties': 'list[object]',
            'constraints': 'list[object]',
            'binding': 'list[object]',
            'relationships': 'list[object]',
            'join_backed_mapping': 'list[object]'
        }

        self.attribute_map = {
            'entity_type': 'entityType',
            'compact_iri': 'compactIri',
            'iri': 'iri',
            'path': 'path',
            'label': 'label',
            'comment': 'comment',
            'description': 'description',
            'pref_label': 'prefLabel',
            'definition': 'definition',
            'scope_notes': 'scopeNotes',
            'alt_labels': 'altLabels',
            'synonyms': 'synonyms',
            'version_info': 'versionInfo',
            'default_prefix': 'defaultPrefix',
            'prefix': 'prefix',
            'imports': 'imports',
            'sub_class_of': 'subClassOf',
            'equivalent_classes': 'equivalentClasses',
            'disjoint_with': 'disjointWith',
            'related_classes': 'relatedClasses',
            'entity_role': 'entityRole',
            'grain_key': 'grainKey',
            'measure_group': 'measureGroup',
            'bi_subject_area': 'biSubjectArea',
            'bi_subject_area_table': 'biSubjectAreaTable',
            'property_type': 'propertyType',
            'data_type': 'dataType',
            'mapped_column': 'mappedColumn',
            'domain': 'domain',
            'range': 'range',
            'cardinality': 'cardinality',
            'sub_property_of': 'subPropertyOf',
            'inverse_of': 'inverseOf',
            'owl_characteristics': 'owlCharacteristics',
            'properties': 'properties',
            'constraints': 'constraints',
            'binding': 'binding',
            'relationships': 'relationships',
            'join_backed_mapping': 'joinBackedMapping'
        }

        self._entity_type = None
        self._compact_iri = None
        self._iri = None
        self._path = None
        self._label = None
        self._comment = None
        self._description = None
        self._pref_label = None
        self._definition = None
        self._scope_notes = None
        self._alt_labels = None
        self._synonyms = None
        self._version_info = None
        self._default_prefix = None
        self._prefix = None
        self._imports = None
        self._sub_class_of = None
        self._equivalent_classes = None
        self._disjoint_with = None
        self._related_classes = None
        self._entity_role = None
        self._grain_key = None
        self._measure_group = None
        self._bi_subject_area = None
        self._bi_subject_area_table = None
        self._property_type = None
        self._data_type = None
        self._mapped_column = None
        self._domain = None
        self._range = None
        self._cardinality = None
        self._sub_property_of = None
        self._inverse_of = None
        self._owl_characteristics = None
        self._properties = None
        self._constraints = None
        self._binding = None
        self._relationships = None
        self._join_backed_mapping = None

    @property
    def entity_type(self):
        """
        **[Required]** Gets the entity_type of this OntologyEntity.
        Ontology entity type. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap.


        :return: The entity_type of this OntologyEntity.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type):
        """
        Sets the entity_type of this OntologyEntity.
        Ontology entity type. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap.


        :param entity_type: The entity_type of this OntologyEntity.
        :type: str
        """
        self._entity_type = entity_type

    @property
    def compact_iri(self):
        """
        Gets the compact_iri of this OntologyEntity.
        Compact IRI for the entity, such as ex:Product.


        :return: The compact_iri of this OntologyEntity.
        :rtype: str
        """
        return self._compact_iri

    @compact_iri.setter
    def compact_iri(self, compact_iri):
        """
        Sets the compact_iri of this OntologyEntity.
        Compact IRI for the entity, such as ex:Product.


        :param compact_iri: The compact_iri of this OntologyEntity.
        :type: str
        """
        self._compact_iri = compact_iri

    @property
    def iri(self):
        """
        Gets the iri of this OntologyEntity.
        Full IRI for the entity, such as https://example.com/ontology/Product.


        :return: The iri of this OntologyEntity.
        :rtype: str
        """
        return self._iri

    @iri.setter
    def iri(self, iri):
        """
        Sets the iri of this OntologyEntity.
        Full IRI for the entity, such as https://example.com/ontology/Product.


        :param iri: The iri of this OntologyEntity.
        :type: str
        """
        self._iri = iri

    @property
    def path(self):
        """
        Gets the path of this OntologyEntity.
        Project-relative Turtle file path used when creating a new OwlOntology. If omitted, the service creates concepts/{safeOntologyName}.ttl.


        :return: The path of this OntologyEntity.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this OntologyEntity.
        Project-relative Turtle file path used when creating a new OwlOntology. If omitted, the service creates concepts/{safeOntologyName}.ttl.


        :param path: The path of this OntologyEntity.
        :type: str
        """
        self._path = path

    @property
    def label(self):
        """
        Gets the label of this OntologyEntity.
        Human-readable entity label.


        :return: The label of this OntologyEntity.
        :rtype: str
        """
        return self._label

    @label.setter
    def label(self, label):
        """
        Sets the label of this OntologyEntity.
        Human-readable entity label.


        :param label: The label of this OntologyEntity.
        :type: str
        """
        self._label = label

    @property
    def comment(self):
        """
        Gets the comment of this OntologyEntity.
        Human-readable entity comment.


        :return: The comment of this OntologyEntity.
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment):
        """
        Sets the comment of this OntologyEntity.
        Human-readable entity comment.


        :param comment: The comment of this OntologyEntity.
        :type: str
        """
        self._comment = comment

    @property
    def description(self):
        """
        Gets the description of this OntologyEntity.
        Human-readable entity description.


        :return: The description of this OntologyEntity.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this OntologyEntity.
        Human-readable entity description.


        :param description: The description of this OntologyEntity.
        :type: str
        """
        self._description = description

    @property
    def pref_label(self):
        """
        Gets the pref_label of this OntologyEntity.
        Preferred SKOS label for the entity.


        :return: The pref_label of this OntologyEntity.
        :rtype: str
        """
        return self._pref_label

    @pref_label.setter
    def pref_label(self, pref_label):
        """
        Sets the pref_label of this OntologyEntity.
        Preferred SKOS label for the entity.


        :param pref_label: The pref_label of this OntologyEntity.
        :type: str
        """
        self._pref_label = pref_label

    @property
    def definition(self):
        """
        Gets the definition of this OntologyEntity.
        SKOS definition text for the entity.


        :return: The definition of this OntologyEntity.
        :rtype: str
        """
        return self._definition

    @definition.setter
    def definition(self, definition):
        """
        Sets the definition of this OntologyEntity.
        SKOS definition text for the entity.


        :param definition: The definition of this OntologyEntity.
        :type: str
        """
        self._definition = definition

    @property
    def scope_notes(self):
        """
        Gets the scope_notes of this OntologyEntity.
        SKOS scope note text for the entity.


        :return: The scope_notes of this OntologyEntity.
        :rtype: str
        """
        return self._scope_notes

    @scope_notes.setter
    def scope_notes(self, scope_notes):
        """
        Sets the scope_notes of this OntologyEntity.
        SKOS scope note text for the entity.


        :param scope_notes: The scope_notes of this OntologyEntity.
        :type: str
        """
        self._scope_notes = scope_notes

    @property
    def alt_labels(self):
        """
        Gets the alt_labels of this OntologyEntity.
        Alternative SKOS labels for the entity.


        :return: The alt_labels of this OntologyEntity.
        :rtype: list[str]
        """
        return self._alt_labels

    @alt_labels.setter
    def alt_labels(self, alt_labels):
        """
        Sets the alt_labels of this OntologyEntity.
        Alternative SKOS labels for the entity.


        :param alt_labels: The alt_labels of this OntologyEntity.
        :type: list[str]
        """
        self._alt_labels = alt_labels

    @property
    def synonyms(self):
        """
        Gets the synonyms of this OntologyEntity.
        Synonym labels for the entity.


        :return: The synonyms of this OntologyEntity.
        :rtype: list[str]
        """
        return self._synonyms

    @synonyms.setter
    def synonyms(self, synonyms):
        """
        Sets the synonyms of this OntologyEntity.
        Synonym labels for the entity.


        :param synonyms: The synonyms of this OntologyEntity.
        :type: list[str]
        """
        self._synonyms = synonyms

    @property
    def version_info(self):
        """
        Gets the version_info of this OntologyEntity.
        OWL version information for ontology entities.


        :return: The version_info of this OntologyEntity.
        :rtype: str
        """
        return self._version_info

    @version_info.setter
    def version_info(self, version_info):
        """
        Sets the version_info of this OntologyEntity.
        OWL version information for ontology entities.


        :param version_info: The version_info of this OntologyEntity.
        :type: str
        """
        self._version_info = version_info

    @property
    def default_prefix(self):
        """
        Gets the default_prefix of this OntologyEntity.
        Default prefix used to identify entities that belong to this ontology.


        :return: The default_prefix of this OntologyEntity.
        :rtype: str
        """
        return self._default_prefix

    @default_prefix.setter
    def default_prefix(self, default_prefix):
        """
        Sets the default_prefix of this OntologyEntity.
        Default prefix used to identify entities that belong to this ontology.


        :param default_prefix: The default_prefix of this OntologyEntity.
        :type: str
        """
        self._default_prefix = default_prefix

    @property
    def prefix(self):
        """
        Gets the prefix of this OntologyEntity.
        Namespace prefix mappings defined by the ontology file, including the default prefix mapping when present.


        :return: The prefix of this OntologyEntity.
        :rtype: dict(str, str)
        """
        return self._prefix

    @prefix.setter
    def prefix(self, prefix):
        """
        Sets the prefix of this OntologyEntity.
        Namespace prefix mappings defined by the ontology file, including the default prefix mapping when present.


        :param prefix: The prefix of this OntologyEntity.
        :type: dict(str, str)
        """
        self._prefix = prefix

    @property
    def imports(self):
        """
        Gets the imports of this OntologyEntity.
        OWL ontology import IRIs.


        :return: The imports of this OntologyEntity.
        :rtype: list[str]
        """
        return self._imports

    @imports.setter
    def imports(self, imports):
        """
        Sets the imports of this OntologyEntity.
        OWL ontology import IRIs.


        :param imports: The imports of this OntologyEntity.
        :type: list[str]
        """
        self._imports = imports

    @property
    def sub_class_of(self):
        """
        Gets the sub_class_of of this OntologyEntity.
        Parent class IRIs or prefixed names for class entities.


        :return: The sub_class_of of this OntologyEntity.
        :rtype: list[str]
        """
        return self._sub_class_of

    @sub_class_of.setter
    def sub_class_of(self, sub_class_of):
        """
        Sets the sub_class_of of this OntologyEntity.
        Parent class IRIs or prefixed names for class entities.


        :param sub_class_of: The sub_class_of of this OntologyEntity.
        :type: list[str]
        """
        self._sub_class_of = sub_class_of

    @property
    def equivalent_classes(self):
        """
        Gets the equivalent_classes of this OntologyEntity.
        Equivalent class IRIs or prefixed names for class entities.


        :return: The equivalent_classes of this OntologyEntity.
        :rtype: list[str]
        """
        return self._equivalent_classes

    @equivalent_classes.setter
    def equivalent_classes(self, equivalent_classes):
        """
        Sets the equivalent_classes of this OntologyEntity.
        Equivalent class IRIs or prefixed names for class entities.


        :param equivalent_classes: The equivalent_classes of this OntologyEntity.
        :type: list[str]
        """
        self._equivalent_classes = equivalent_classes

    @property
    def disjoint_with(self):
        """
        Gets the disjoint_with of this OntologyEntity.
        Disjoint class IRIs or prefixed names for class entities.


        :return: The disjoint_with of this OntologyEntity.
        :rtype: list[str]
        """
        return self._disjoint_with

    @disjoint_with.setter
    def disjoint_with(self, disjoint_with):
        """
        Sets the disjoint_with of this OntologyEntity.
        Disjoint class IRIs or prefixed names for class entities.


        :param disjoint_with: The disjoint_with of this OntologyEntity.
        :type: list[str]
        """
        self._disjoint_with = disjoint_with

    @property
    def related_classes(self):
        """
        Gets the related_classes of this OntologyEntity.
        Related class IRIs or prefixed names for class entities.


        :return: The related_classes of this OntologyEntity.
        :rtype: list[str]
        """
        return self._related_classes

    @related_classes.setter
    def related_classes(self, related_classes):
        """
        Sets the related_classes of this OntologyEntity.
        Related class IRIs or prefixed names for class entities.


        :param related_classes: The related_classes of this OntologyEntity.
        :type: list[str]
        """
        self._related_classes = related_classes

    @property
    def entity_role(self):
        """
        Gets the entity_role of this OntologyEntity.
        Role of the class in the business or BI model.


        :return: The entity_role of this OntologyEntity.
        :rtype: str
        """
        return self._entity_role

    @entity_role.setter
    def entity_role(self, entity_role):
        """
        Sets the entity_role of this OntologyEntity.
        Role of the class in the business or BI model.


        :param entity_role: The entity_role of this OntologyEntity.
        :type: str
        """
        self._entity_role = entity_role

    @property
    def grain_key(self):
        """
        Gets the grain_key of this OntologyEntity.
        Property names or IRIs defining analytical grain.


        :return: The grain_key of this OntologyEntity.
        :rtype: list[str]
        """
        return self._grain_key

    @grain_key.setter
    def grain_key(self, grain_key):
        """
        Sets the grain_key of this OntologyEntity.
        Property names or IRIs defining analytical grain.


        :param grain_key: The grain_key of this OntologyEntity.
        :type: list[str]
        """
        self._grain_key = grain_key

    @property
    def measure_group(self):
        """
        Gets the measure_group of this OntologyEntity.
        BI measure group association.


        :return: The measure_group of this OntologyEntity.
        :rtype: str
        """
        return self._measure_group

    @measure_group.setter
    def measure_group(self, measure_group):
        """
        Sets the measure_group of this OntologyEntity.
        BI measure group association.


        :param measure_group: The measure_group of this OntologyEntity.
        :type: str
        """
        self._measure_group = measure_group

    @property
    def bi_subject_area(self):
        """
        Gets the bi_subject_area of this OntologyEntity.
        Source BI subject area.


        :return: The bi_subject_area of this OntologyEntity.
        :rtype: str
        """
        return self._bi_subject_area

    @bi_subject_area.setter
    def bi_subject_area(self, bi_subject_area):
        """
        Sets the bi_subject_area of this OntologyEntity.
        Source BI subject area.


        :param bi_subject_area: The bi_subject_area of this OntologyEntity.
        :type: str
        """
        self._bi_subject_area = bi_subject_area

    @property
    def bi_subject_area_table(self):
        """
        Gets the bi_subject_area_table of this OntologyEntity.
        Source BI subject area table mapping.


        :return: The bi_subject_area_table of this OntologyEntity.
        :rtype: str
        """
        return self._bi_subject_area_table

    @bi_subject_area_table.setter
    def bi_subject_area_table(self, bi_subject_area_table):
        """
        Sets the bi_subject_area_table of this OntologyEntity.
        Source BI subject area table mapping.


        :param bi_subject_area_table: The bi_subject_area_table of this OntologyEntity.
        :type: str
        """
        self._bi_subject_area_table = bi_subject_area_table

    @property
    def property_type(self):
        """
        Gets the property_type of this OntologyEntity.
        Property kind for OwlProperty, such as datatype or object.


        :return: The property_type of this OntologyEntity.
        :rtype: str
        """
        return self._property_type

    @property_type.setter
    def property_type(self, property_type):
        """
        Sets the property_type of this OntologyEntity.
        Property kind for OwlProperty, such as datatype or object.


        :param property_type: The property_type of this OntologyEntity.
        :type: str
        """
        self._property_type = property_type

    @property
    def data_type(self):
        """
        Gets the data_type of this OntologyEntity.
        Expected datatype for an OwlProperty or class property object.


        :return: The data_type of this OntologyEntity.
        :rtype: str
        """
        return self._data_type

    @data_type.setter
    def data_type(self, data_type):
        """
        Sets the data_type of this OntologyEntity.
        Expected datatype for an OwlProperty or class property object.


        :param data_type: The data_type of this OntologyEntity.
        :type: str
        """
        self._data_type = data_type

    @property
    def mapped_column(self):
        """
        Gets the mapped_column of this OntologyEntity.
        Physical source column mapped to the property.


        :return: The mapped_column of this OntologyEntity.
        :rtype: str
        """
        return self._mapped_column

    @mapped_column.setter
    def mapped_column(self, mapped_column):
        """
        Sets the mapped_column of this OntologyEntity.
        Physical source column mapped to the property.


        :param mapped_column: The mapped_column of this OntologyEntity.
        :type: str
        """
        self._mapped_column = mapped_column

    @property
    def domain(self):
        """
        Gets the domain of this OntologyEntity.
        Domain class IRIs or prefixed names for relationship entities.


        :return: The domain of this OntologyEntity.
        :rtype: str
        """
        return self._domain

    @domain.setter
    def domain(self, domain):
        """
        Sets the domain of this OntologyEntity.
        Domain class IRIs or prefixed names for relationship entities.


        :param domain: The domain of this OntologyEntity.
        :type: str
        """
        self._domain = domain

    @property
    def range(self):
        """
        Gets the range of this OntologyEntity.
        Range class IRIs or prefixed names for relationship entities.


        :return: The range of this OntologyEntity.
        :rtype: str
        """
        return self._range

    @range.setter
    def range(self, range):
        """
        Sets the range of this OntologyEntity.
        Range class IRIs or prefixed names for relationship entities.


        :param range: The range of this OntologyEntity.
        :type: str
        """
        self._range = range

    @property
    def cardinality(self):
        """
        Gets the cardinality of this OntologyEntity.

        :return: The cardinality of this OntologyEntity.
        :rtype: oci.aidataplatform_dp.models.OntologyEntityCardinality
        """
        return self._cardinality

    @cardinality.setter
    def cardinality(self, cardinality):
        """
        Sets the cardinality of this OntologyEntity.

        :param cardinality: The cardinality of this OntologyEntity.
        :type: oci.aidataplatform_dp.models.OntologyEntityCardinality
        """
        self._cardinality = cardinality

    @property
    def sub_property_of(self):
        """
        Gets the sub_property_of of this OntologyEntity.
        Parent property IRIs or prefixed names for relationship entities.


        :return: The sub_property_of of this OntologyEntity.
        :rtype: list[str]
        """
        return self._sub_property_of

    @sub_property_of.setter
    def sub_property_of(self, sub_property_of):
        """
        Sets the sub_property_of of this OntologyEntity.
        Parent property IRIs or prefixed names for relationship entities.


        :param sub_property_of: The sub_property_of of this OntologyEntity.
        :type: list[str]
        """
        self._sub_property_of = sub_property_of

    @property
    def inverse_of(self):
        """
        Gets the inverse_of of this OntologyEntity.
        Inverse property IRIs or prefixed names for relationship entities.


        :return: The inverse_of of this OntologyEntity.
        :rtype: str
        """
        return self._inverse_of

    @inverse_of.setter
    def inverse_of(self, inverse_of):
        """
        Sets the inverse_of of this OntologyEntity.
        Inverse property IRIs or prefixed names for relationship entities.


        :param inverse_of: The inverse_of of this OntologyEntity.
        :type: str
        """
        self._inverse_of = inverse_of

    @property
    def owl_characteristics(self):
        """
        Gets the owl_characteristics of this OntologyEntity.
        OWL property characteristics such as FunctionalProperty, TransitiveProperty, or IrreflexiveProperty.


        :return: The owl_characteristics of this OntologyEntity.
        :rtype: list[str]
        """
        return self._owl_characteristics

    @owl_characteristics.setter
    def owl_characteristics(self, owl_characteristics):
        """
        Sets the owl_characteristics of this OntologyEntity.
        OWL property characteristics such as FunctionalProperty, TransitiveProperty, or IrreflexiveProperty.


        :param owl_characteristics: The owl_characteristics of this OntologyEntity.
        :type: list[str]
        """
        self._owl_characteristics = owl_characteristics

    @property
    def properties(self):
        """
        Gets the properties of this OntologyEntity.
        Property definitions associated with the class.


        :return: The properties of this OntologyEntity.
        :rtype: list[object]
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this OntologyEntity.
        Property definitions associated with the class.


        :param properties: The properties of this OntologyEntity.
        :type: list[object]
        """
        self._properties = properties

    @property
    def constraints(self):
        """
        Gets the constraints of this OntologyEntity.
        Validation or governance constraints for the class.


        :return: The constraints of this OntologyEntity.
        :rtype: list[object]
        """
        return self._constraints

    @constraints.setter
    def constraints(self, constraints):
        """
        Sets the constraints of this OntologyEntity.
        Validation or governance constraints for the class.


        :param constraints: The constraints of this OntologyEntity.
        :type: list[object]
        """
        self._constraints = constraints

    @property
    def binding(self):
        """
        Gets the binding of this OntologyEntity.
        R2RML or RML bindings for the class.


        :return: The binding of this OntologyEntity.
        :rtype: list[object]
        """
        return self._binding

    @binding.setter
    def binding(self, binding):
        """
        Sets the binding of this OntologyEntity.
        R2RML or RML bindings for the class.


        :param binding: The binding of this OntologyEntity.
        :type: list[object]
        """
        self._binding = binding

    @property
    def relationships(self):
        """
        Gets the relationships of this OntologyEntity.
        Relationship definitions associated with the class.


        :return: The relationships of this OntologyEntity.
        :rtype: list[object]
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships):
        """
        Sets the relationships of this OntologyEntity.
        Relationship definitions associated with the class.


        :param relationships: The relationships of this OntologyEntity.
        :type: list[object]
        """
        self._relationships = relationships

    @property
    def join_backed_mapping(self):
        """
        Gets the join_backed_mapping of this OntologyEntity.
        Join-backed mapping entries for a relationship.


        :return: The join_backed_mapping of this OntologyEntity.
        :rtype: list[object]
        """
        return self._join_backed_mapping

    @join_backed_mapping.setter
    def join_backed_mapping(self, join_backed_mapping):
        """
        Sets the join_backed_mapping of this OntologyEntity.
        Join-backed mapping entries for a relationship.


        :param join_backed_mapping: The join_backed_mapping of this OntologyEntity.
        :type: list[object]
        """
        self._join_backed_mapping = join_backed_mapping

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
