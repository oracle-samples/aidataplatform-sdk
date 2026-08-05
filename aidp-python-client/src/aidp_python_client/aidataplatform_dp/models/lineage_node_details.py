# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LineageNodeDetails(object):
    """
    Lineage for a data entity.
    """

    #: A constant which can be used with the reference_type property of a LineageNodeDetails.
    #: This constant has a value of "CHILD"
    REFERENCE_TYPE_CHILD = "CHILD"

    #: A constant which can be used with the reference_type property of a LineageNodeDetails.
    #: This constant has a value of "PARENT"
    REFERENCE_TYPE_PARENT = "PARENT"

    def __init__(self, **kwargs):
        """
        Initializes a new LineageNodeDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this LineageNodeDetails.
        :type id: str

        :param qualified_name:
            The value to assign to the qualified_name property of this LineageNodeDetails.
        :type qualified_name: str

        :param reference_type:
            The value to assign to the reference_type property of this LineageNodeDetails.
            Allowed values for this property are: "CHILD", "PARENT"
        :type reference_type: str

        :param name:
            The value to assign to the name property of this LineageNodeDetails.
        :type name: str

        :param type:
            The value to assign to the type property of this LineageNodeDetails.
        :type type: str

        :param parent_id:
            The value to assign to the parent_id property of this LineageNodeDetails.
        :type parent_id: str

        :param properties:
            The value to assign to the properties property of this LineageNodeDetails.
        :type properties: dict(str, object)

        """
        self.swagger_types = {
            'id': 'str',
            'qualified_name': 'str',
            'reference_type': 'str',
            'name': 'str',
            'type': 'str',
            'parent_id': 'str',
            'properties': 'dict(str, object)'
        }

        self.attribute_map = {
            'id': 'id',
            'qualified_name': 'qualifiedName',
            'reference_type': 'referenceType',
            'name': 'name',
            'type': 'type',
            'parent_id': 'parentId',
            'properties': 'properties'
        }

        self._id = None
        self._qualified_name = None
        self._reference_type = None
        self._name = None
        self._type = None
        self._parent_id = None
        self._properties = None

    @property
    def id(self):
        """
        **[Required]** Gets the id of this LineageNodeDetails.
        Unique identifier (GUID) of the node.


        :return: The id of this LineageNodeDetails.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this LineageNodeDetails.
        Unique identifier (GUID) of the node.


        :param id: The id of this LineageNodeDetails.
        :type: str
        """
        self._id = id

    @property
    def qualified_name(self):
        """
        **[Required]** Gets the qualified_name of this LineageNodeDetails.
        Fully\u2011qualified name (`namespace:name`) of the node.


        :return: The qualified_name of this LineageNodeDetails.
        :rtype: str
        """
        return self._qualified_name

    @qualified_name.setter
    def qualified_name(self, qualified_name):
        """
        Sets the qualified_name of this LineageNodeDetails.
        Fully\u2011qualified name (`namespace:name`) of the node.


        :param qualified_name: The qualified_name of this LineageNodeDetails.
        :type: str
        """
        self._qualified_name = qualified_name

    @property
    def reference_type(self):
        """
        **[Required]** Gets the reference_type of this LineageNodeDetails.
        referenceType of the node

        Allowed values for this property are: "CHILD", "PARENT"


        :return: The reference_type of this LineageNodeDetails.
        :rtype: str
        """
        return self._reference_type

    @reference_type.setter
    def reference_type(self, reference_type):
        """
        Sets the reference_type of this LineageNodeDetails.
        referenceType of the node


        :param reference_type: The reference_type of this LineageNodeDetails.
        :type: str
        """
        allowed_values = ["CHILD", "PARENT"]
        if not value_allowed_none_or_none_sentinel(reference_type, allowed_values):
            raise ValueError(
                "Invalid value for `reference_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._reference_type = reference_type

    @property
    def name(self):
        """
        **[Required]** Gets the name of this LineageNodeDetails.
        Human\u2011readable name of the node.


        :return: The name of this LineageNodeDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this LineageNodeDetails.
        Human\u2011readable name of the node.


        :param name: The name of this LineageNodeDetails.
        :type: str
        """
        self._name = name

    @property
    def type(self):
        """
        **[Required]** Gets the type of this LineageNodeDetails.
        High\u2011level categorisation (e.g., WorkspaceObject, Dataset, etc.).


        :return: The type of this LineageNodeDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this LineageNodeDetails.
        High\u2011level categorisation (e.g., WorkspaceObject, Dataset, etc.).


        :param type: The type of this LineageNodeDetails.
        :type: str
        """
        self._type = type

    @property
    def parent_id(self):
        """
        **[Required]** Gets the parent_id of this LineageNodeDetails.
        Parent of the node


        :return: The parent_id of this LineageNodeDetails.
        :rtype: str
        """
        return self._parent_id

    @parent_id.setter
    def parent_id(self, parent_id):
        """
        Sets the parent_id of this LineageNodeDetails.
        Parent of the node


        :param parent_id: The parent_id of this LineageNodeDetails.
        :type: str
        """
        self._parent_id = parent_id

    @property
    def properties(self):
        """
        **[Required]** Gets the properties of this LineageNodeDetails.
        A generic property bag associated with the Node


        :return: The properties of this LineageNodeDetails.
        :rtype: dict(str, object)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this LineageNodeDetails.
        A generic property bag associated with the Node


        :param properties: The properties of this LineageNodeDetails.
        :type: dict(str, object)
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
