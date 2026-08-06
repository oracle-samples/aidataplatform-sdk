# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphSearchResult(object):
    """
    Search hit from a published ontology graph metadata object.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphSearchResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this OntologyGraphSearchResult.
        :type id: str

        :param type:
            The value to assign to the type property of this OntologyGraphSearchResult.
        :type type: str

        :param name:
            The value to assign to the name property of this OntologyGraphSearchResult.
        :type name: str

        :param label:
            The value to assign to the label property of this OntologyGraphSearchResult.
        :type label: str

        :param description:
            The value to assign to the description property of this OntologyGraphSearchResult.
        :type description: str

        :param source_id:
            The value to assign to the source_id property of this OntologyGraphSearchResult.
        :type source_id: str

        :param target_id:
            The value to assign to the target_id property of this OntologyGraphSearchResult.
        :type target_id: str

        :param relationship_label:
            The value to assign to the relationship_label property of this OntologyGraphSearchResult.
        :type relationship_label: str

        """
        self.swagger_types = {
            'id': 'str',
            'type': 'str',
            'name': 'str',
            'label': 'str',
            'description': 'str',
            'source_id': 'str',
            'target_id': 'str',
            'relationship_label': 'str'
        }

        self.attribute_map = {
            'id': 'id',
            'type': 'type',
            'name': 'name',
            'label': 'label',
            'description': 'description',
            'source_id': 'sourceId',
            'target_id': 'targetId',
            'relationship_label': 'relationshipLabel'
        }

        self._id = None
        self._type = None
        self._name = None
        self._label = None
        self._description = None
        self._source_id = None
        self._target_id = None
        self._relationship_label = None

    @property
    def id(self):
        """
        **[Required]** Gets the id of this OntologyGraphSearchResult.
        Stable ontology object identifier, usually an IRI or generated relationship id.


        :return: The id of this OntologyGraphSearchResult.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this OntologyGraphSearchResult.
        Stable ontology object identifier, usually an IRI or generated relationship id.


        :param id: The id of this OntologyGraphSearchResult.
        :type: str
        """
        self._id = id

    @property
    def type(self):
        """
        **[Required]** Gets the type of this OntologyGraphSearchResult.
        Result type. One of CLASS, PROPERTY, SHAPE, or RELATIONSHIP.


        :return: The type of this OntologyGraphSearchResult.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this OntologyGraphSearchResult.
        Result type. One of CLASS, PROPERTY, SHAPE, or RELATIONSHIP.


        :param type: The type of this OntologyGraphSearchResult.
        :type: str
        """
        self._type = type

    @property
    def name(self):
        """
        Gets the name of this OntologyGraphSearchResult.
        Local name or generated graph object name.


        :return: The name of this OntologyGraphSearchResult.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this OntologyGraphSearchResult.
        Local name or generated graph object name.


        :param name: The name of this OntologyGraphSearchResult.
        :type: str
        """
        self._name = name

    @property
    def label(self):
        """
        Gets the label of this OntologyGraphSearchResult.
        Human-readable label when available.


        :return: The label of this OntologyGraphSearchResult.
        :rtype: str
        """
        return self._label

    @label.setter
    def label(self, label):
        """
        Sets the label of this OntologyGraphSearchResult.
        Human-readable label when available.


        :param label: The label of this OntologyGraphSearchResult.
        :type: str
        """
        self._label = label

    @property
    def description(self):
        """
        Gets the description of this OntologyGraphSearchResult.

        :return: The description of this OntologyGraphSearchResult.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this OntologyGraphSearchResult.

        :param description: The description of this OntologyGraphSearchResult.
        :type: str
        """
        self._description = description

    @property
    def source_id(self):
        """
        Gets the source_id of this OntologyGraphSearchResult.
        Source class or object identifier for relationship-like results.


        :return: The source_id of this OntologyGraphSearchResult.
        :rtype: str
        """
        return self._source_id

    @source_id.setter
    def source_id(self, source_id):
        """
        Sets the source_id of this OntologyGraphSearchResult.
        Source class or object identifier for relationship-like results.


        :param source_id: The source_id of this OntologyGraphSearchResult.
        :type: str
        """
        self._source_id = source_id

    @property
    def target_id(self):
        """
        Gets the target_id of this OntologyGraphSearchResult.
        Target class or object identifier for relationship-like results.


        :return: The target_id of this OntologyGraphSearchResult.
        :rtype: str
        """
        return self._target_id

    @target_id.setter
    def target_id(self, target_id):
        """
        Sets the target_id of this OntologyGraphSearchResult.
        Target class or object identifier for relationship-like results.


        :param target_id: The target_id of this OntologyGraphSearchResult.
        :type: str
        """
        self._target_id = target_id

    @property
    def relationship_label(self):
        """
        Gets the relationship_label of this OntologyGraphSearchResult.
        Relationship or property kind when available.


        :return: The relationship_label of this OntologyGraphSearchResult.
        :rtype: str
        """
        return self._relationship_label

    @relationship_label.setter
    def relationship_label(self, relationship_label):
        """
        Sets the relationship_label of this OntologyGraphSearchResult.
        Relationship or property kind when available.


        :param relationship_label: The relationship_label of this OntologyGraphSearchResult.
        :type: str
        """
        self._relationship_label = relationship_label

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
