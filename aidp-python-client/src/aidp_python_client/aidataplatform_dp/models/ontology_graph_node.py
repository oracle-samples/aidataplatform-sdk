# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphNode(object):
    """
    Published ontology graph node.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphNode object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this OntologyGraphNode.
        :type id: str

        :param type:
            The value to assign to the type property of this OntologyGraphNode.
        :type type: str

        :param name:
            The value to assign to the name property of this OntologyGraphNode.
        :type name: str

        :param label:
            The value to assign to the label property of this OntologyGraphNode.
        :type label: str

        :param description:
            The value to assign to the description property of this OntologyGraphNode.
        :type description: str

        """
        self.swagger_types = {
            'id': 'str',
            'type': 'str',
            'name': 'str',
            'label': 'str',
            'description': 'str'
        }

        self.attribute_map = {
            'id': 'id',
            'type': 'type',
            'name': 'name',
            'label': 'label',
            'description': 'description'
        }

        self._id = None
        self._type = None
        self._name = None
        self._label = None
        self._description = None

    @property
    def id(self):
        """
        **[Required]** Gets the id of this OntologyGraphNode.

        :return: The id of this OntologyGraphNode.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this OntologyGraphNode.

        :param id: The id of this OntologyGraphNode.
        :type: str
        """
        self._id = id

    @property
    def type(self):
        """
        **[Required]** Gets the type of this OntologyGraphNode.
        CLASS, PROPERTY, SHAPE, CONSTRAINT, or RELATIONSHIP.


        :return: The type of this OntologyGraphNode.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this OntologyGraphNode.
        CLASS, PROPERTY, SHAPE, CONSTRAINT, or RELATIONSHIP.


        :param type: The type of this OntologyGraphNode.
        :type: str
        """
        self._type = type

    @property
    def name(self):
        """
        Gets the name of this OntologyGraphNode.

        :return: The name of this OntologyGraphNode.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this OntologyGraphNode.

        :param name: The name of this OntologyGraphNode.
        :type: str
        """
        self._name = name

    @property
    def label(self):
        """
        Gets the label of this OntologyGraphNode.

        :return: The label of this OntologyGraphNode.
        :rtype: str
        """
        return self._label

    @label.setter
    def label(self, label):
        """
        Sets the label of this OntologyGraphNode.

        :param label: The label of this OntologyGraphNode.
        :type: str
        """
        self._label = label

    @property
    def description(self):
        """
        Gets the description of this OntologyGraphNode.

        :return: The description of this OntologyGraphNode.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this OntologyGraphNode.

        :param description: The description of this OntologyGraphNode.
        :type: str
        """
        self._description = description

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
