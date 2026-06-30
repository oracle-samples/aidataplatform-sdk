# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LineageRelationship(object):
    """
    Declares how two elements of object lineage are related.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LineageRelationship object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param from_node_id:
            The value to assign to the from_node_id property of this LineageRelationship.
        :type from_node_id: str

        :param to_node_id:
            The value to assign to the to_node_id property of this LineageRelationship.
        :type to_node_id: str

        :param type:
            The value to assign to the type property of this LineageRelationship.
        :type type: str

        :param provider_type:
            The value to assign to the provider_type property of this LineageRelationship.
        :type provider_type: str

        :param properties:
            The value to assign to the properties property of this LineageRelationship.
        :type properties: dict(str, dict(str, str))

        """
        self.swagger_types = {
            'from_node_id': 'str',
            'to_node_id': 'str',
            'type': 'str',
            'provider_type': 'str',
            'properties': 'dict(str, dict(str, str))'
        }

        self.attribute_map = {
            'from_node_id': 'fromNodeId',
            'to_node_id': 'toNodeId',
            'type': 'type',
            'provider_type': 'providerType',
            'properties': 'properties'
        }

        self._from_node_id = None
        self._to_node_id = None
        self._type = None
        self._provider_type = None
        self._properties = None

    @property
    def from_node_id(self):
        """
        Gets the from_node_id of this LineageRelationship.
        Object key of source lineage element.


        :return: The from_node_id of this LineageRelationship.
        :rtype: str
        """
        return self._from_node_id

    @from_node_id.setter
    def from_node_id(self, from_node_id):
        """
        Sets the from_node_id of this LineageRelationship.
        Object key of source lineage element.


        :param from_node_id: The from_node_id of this LineageRelationship.
        :type: str
        """
        self._from_node_id = from_node_id

    @property
    def to_node_id(self):
        """
        Gets the to_node_id of this LineageRelationship.
        Object key of target lineage element.


        :return: The to_node_id of this LineageRelationship.
        :rtype: str
        """
        return self._to_node_id

    @to_node_id.setter
    def to_node_id(self, to_node_id):
        """
        Sets the to_node_id of this LineageRelationship.
        Object key of target lineage element.


        :param to_node_id: The to_node_id of this LineageRelationship.
        :type: str
        """
        self._to_node_id = to_node_id

    @property
    def type(self):
        """
        Gets the type of this LineageRelationship.
        Type of the relationship.


        :return: The type of this LineageRelationship.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this LineageRelationship.
        Type of the relationship.


        :param type: The type of this LineageRelationship.
        :type: str
        """
        self._type = type

    @property
    def provider_type(self):
        """
        Gets the provider_type of this LineageRelationship.
        Type of the relationship.


        :return: The provider_type of this LineageRelationship.
        :rtype: str
        """
        return self._provider_type

    @provider_type.setter
    def provider_type(self, provider_type):
        """
        Sets the provider_type of this LineageRelationship.
        Type of the relationship.


        :param provider_type: The provider_type of this LineageRelationship.
        :type: str
        """
        self._provider_type = provider_type

    @property
    def properties(self):
        """
        Gets the properties of this LineageRelationship.
        A map of maps that contains the properties which are specific to the entity type. Each entity type
        definition defines it's set of required and optional properties. The map keys are category names and the
        values are maps of property name to property value. Every property is contained inside of a category. Most
        data entities have required properties within the \"default\" category.
        Example: `{\"properties\": { \"default\": { \"key1\": \"value1\"}}}`


        :return: The properties of this LineageRelationship.
        :rtype: dict(str, dict(str, str))
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this LineageRelationship.
        A map of maps that contains the properties which are specific to the entity type. Each entity type
        definition defines it's set of required and optional properties. The map keys are category names and the
        values are maps of property name to property value. Every property is contained inside of a category. Most
        data entities have required properties within the \"default\" category.
        Example: `{\"properties\": { \"default\": { \"key1\": \"value1\"}}}`


        :param properties: The properties of this LineageRelationship.
        :type: dict(str, dict(str, str))
        """
        self._properties = properties

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
