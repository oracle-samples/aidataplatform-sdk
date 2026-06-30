# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LineageObject(object):
    """
    Object describing an individual element of object lineage.
    """

    #: A constant which can be used with the direction property of a LineageObject.
    #: This constant has a value of "UPSTREAM"
    DIRECTION_UPSTREAM = "UPSTREAM"

    #: A constant which can be used with the direction property of a LineageObject.
    #: This constant has a value of "BOTH"
    DIRECTION_BOTH = "BOTH"

    #: A constant which can be used with the direction property of a LineageObject.
    #: This constant has a value of "DOWNSTREAM"
    DIRECTION_DOWNSTREAM = "DOWNSTREAM"

    def __init__(self, **kwargs):
        """
        Initializes a new LineageObject object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this LineageObject.
        :type id: str

        :param qualified_name:
            The value to assign to the qualified_name property of this LineageObject.
        :type qualified_name: str

        :param display_name:
            The value to assign to the display_name property of this LineageObject.
        :type display_name: str

        :param parent_id:
            The value to assign to the parent_id property of this LineageObject.
        :type parent_id: str

        :param type:
            The value to assign to the type property of this LineageObject.
        :type type: str

        :param direction:
            The value to assign to the direction property of this LineageObject.
            Allowed values for this property are: "UPSTREAM", "BOTH", "DOWNSTREAM", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type direction: str

        :param depth:
            The value to assign to the depth property of this LineageObject.
        :type depth: int

        :param properties:
            The value to assign to the properties property of this LineageObject.
        :type properties: dict(str, dict(str, str))

        """
        self.swagger_types = {
            'id': 'str',
            'qualified_name': 'str',
            'display_name': 'str',
            'parent_id': 'str',
            'type': 'str',
            'direction': 'str',
            'depth': 'int',
            'properties': 'dict(str, dict(str, str))'
        }

        self.attribute_map = {
            'id': 'id',
            'qualified_name': 'qualifiedName',
            'display_name': 'displayName',
            'parent_id': 'parentId',
            'type': 'type',
            'direction': 'direction',
            'depth': 'depth',
            'properties': 'properties'
        }

        self._id = None
        self._qualified_name = None
        self._display_name = None
        self._parent_id = None
        self._type = None
        self._direction = None
        self._depth = None
        self._properties = None

    @property
    def id(self):
        """
        Gets the id of this LineageObject.
        Key of the object, such as an entity, about which this lineage applies.


        :return: The id of this LineageObject.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this LineageObject.
        Key of the object, such as an entity, about which this lineage applies.


        :param id: The id of this LineageObject.
        :type: str
        """
        self._id = id

    @property
    def qualified_name(self):
        """
        Gets the qualified_name of this LineageObject.
        External source identifier name of the object.


        :return: The qualified_name of this LineageObject.
        :rtype: str
        """
        return self._qualified_name

    @qualified_name.setter
    def qualified_name(self, qualified_name):
        """
        Sets the qualified_name of this LineageObject.
        External source identifier name of the object.


        :param qualified_name: The qualified_name of this LineageObject.
        :type: str
        """
        self._qualified_name = qualified_name

    @property
    def display_name(self):
        """
        Gets the display_name of this LineageObject.
        Display name of the object.


        :return: The display_name of this LineageObject.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this LineageObject.
        Display name of the object.


        :param display_name: The display_name of this LineageObject.
        :type: str
        """
        self._display_name = display_name

    @property
    def parent_id(self):
        """
        Gets the parent_id of this LineageObject.
        Key of the parent object for this object.


        :return: The parent_id of this LineageObject.
        :rtype: str
        """
        return self._parent_id

    @parent_id.setter
    def parent_id(self, parent_id):
        """
        Sets the parent_id of this LineageObject.
        Key of the parent object for this object.


        :param parent_id: The parent_id of this LineageObject.
        :type: str
        """
        self._parent_id = parent_id

    @property
    def type(self):
        """
        Gets the type of this LineageObject.
        Type name of the object.


        :return: The type of this LineageObject.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this LineageObject.
        Type name of the object.


        :param type: The type of this LineageObject.
        :type: str
        """
        self._type = type

    @property
    def direction(self):
        """
        Gets the direction of this LineageObject.
        Direction of the lineage.

        Allowed values for this property are: "UPSTREAM", "BOTH", "DOWNSTREAM", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The direction of this LineageObject.
        :rtype: str
        """
        return self._direction

    @direction.setter
    def direction(self, direction):
        """
        Sets the direction of this LineageObject.
        Direction of the lineage.


        :param direction: The direction of this LineageObject.
        :type: str
        """
        allowed_values = ["UPSTREAM", "BOTH", "DOWNSTREAM"]
        if not value_allowed_none_or_none_sentinel(direction, allowed_values):
            direction = 'UNKNOWN_ENUM_VALUE'
        self._direction = direction

    @property
    def depth(self):
        """
        Gets the depth of this LineageObject.
        Depth is measured as number of links from anchor node to matching nodes.


        :return: The depth of this LineageObject.
        :rtype: int
        """
        return self._depth

    @depth.setter
    def depth(self, depth):
        """
        Sets the depth of this LineageObject.
        Depth is measured as number of links from anchor node to matching nodes.


        :param depth: The depth of this LineageObject.
        :type: int
        """
        self._depth = depth

    @property
    def properties(self):
        """
        Gets the properties of this LineageObject.
        A map of maps that contains the properties which are specific to the entity type. Each entity type
        definition defines it's set of required and optional properties. The map keys are category names and the
        values are maps of property name to property value. Every property is contained inside of a category. Most
        data entities have required properties within the \"default\" category.
        Example: `{\"properties\": { \"default\": { \"key1\": \"value1\"}}}`


        :return: The properties of this LineageObject.
        :rtype: dict(str, dict(str, str))
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this LineageObject.
        A map of maps that contains the properties which are specific to the entity type. Each entity type
        definition defines it's set of required and optional properties. The map keys are category names and the
        values are maps of property name to property value. Every property is contained inside of a category. Most
        data entities have required properties within the \"default\" category.
        Example: `{\"properties\": { \"default\": { \"key1\": \"value1\"}}}`


        :param properties: The properties of this LineageObject.
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
