# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ProcessNodeColumnDetails(object):
    """
    Structured details for a column participating in a process-node column link.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ProcessNodeColumnDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this ProcessNodeColumnDetails.
        :type display_name: str

        :param id:
            The value to assign to the id property of this ProcessNodeColumnDetails.
        :type id: str

        :param qualified_name:
            The value to assign to the qualified_name property of this ProcessNodeColumnDetails.
        :type qualified_name: str

        :param type:
            The value to assign to the type property of this ProcessNodeColumnDetails.
        :type type: str

        :param parent_display_name:
            The value to assign to the parent_display_name property of this ProcessNodeColumnDetails.
        :type parent_display_name: str

        :param parent_id:
            The value to assign to the parent_id property of this ProcessNodeColumnDetails.
        :type parent_id: str

        :param parent_qualified_name:
            The value to assign to the parent_qualified_name property of this ProcessNodeColumnDetails.
        :type parent_qualified_name: str

        :param parent_type:
            The value to assign to the parent_type property of this ProcessNodeColumnDetails.
        :type parent_type: str

        """
        self.swagger_types = {
            'display_name': 'str',
            'id': 'str',
            'qualified_name': 'str',
            'type': 'str',
            'parent_display_name': 'str',
            'parent_id': 'str',
            'parent_qualified_name': 'str',
            'parent_type': 'str'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'id': 'id',
            'qualified_name': 'qualifiedName',
            'type': 'type',
            'parent_display_name': 'parentDisplayName',
            'parent_id': 'parentId',
            'parent_qualified_name': 'parentQualifiedName',
            'parent_type': 'parentType'
        }

        self._display_name = None
        self._id = None
        self._qualified_name = None
        self._type = None
        self._parent_display_name = None
        self._parent_id = None
        self._parent_qualified_name = None
        self._parent_type = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this ProcessNodeColumnDetails.
        Display name of the column.


        :return: The display_name of this ProcessNodeColumnDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this ProcessNodeColumnDetails.
        Display name of the column.


        :param display_name: The display_name of this ProcessNodeColumnDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def id(self):
        """
        **[Required]** Gets the id of this ProcessNodeColumnDetails.
        Unique identifier of the column.


        :return: The id of this ProcessNodeColumnDetails.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this ProcessNodeColumnDetails.
        Unique identifier of the column.


        :param id: The id of this ProcessNodeColumnDetails.
        :type: str
        """
        self._id = id

    @property
    def qualified_name(self):
        """
        **[Required]** Gets the qualified_name of this ProcessNodeColumnDetails.
        Qualified name of the column.


        :return: The qualified_name of this ProcessNodeColumnDetails.
        :rtype: str
        """
        return self._qualified_name

    @qualified_name.setter
    def qualified_name(self, qualified_name):
        """
        Sets the qualified_name of this ProcessNodeColumnDetails.
        Qualified name of the column.


        :param qualified_name: The qualified_name of this ProcessNodeColumnDetails.
        :type: str
        """
        self._qualified_name = qualified_name

    @property
    def type(self):
        """
        **[Required]** Gets the type of this ProcessNodeColumnDetails.
        Type of the column node.


        :return: The type of this ProcessNodeColumnDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this ProcessNodeColumnDetails.
        Type of the column node.


        :param type: The type of this ProcessNodeColumnDetails.
        :type: str
        """
        self._type = type

    @property
    def parent_display_name(self):
        """
        **[Required]** Gets the parent_display_name of this ProcessNodeColumnDetails.
        Display name of the parent artifact containing the column.


        :return: The parent_display_name of this ProcessNodeColumnDetails.
        :rtype: str
        """
        return self._parent_display_name

    @parent_display_name.setter
    def parent_display_name(self, parent_display_name):
        """
        Sets the parent_display_name of this ProcessNodeColumnDetails.
        Display name of the parent artifact containing the column.


        :param parent_display_name: The parent_display_name of this ProcessNodeColumnDetails.
        :type: str
        """
        self._parent_display_name = parent_display_name

    @property
    def parent_id(self):
        """
        **[Required]** Gets the parent_id of this ProcessNodeColumnDetails.
        Unique identifier of the parent artifact containing the column.


        :return: The parent_id of this ProcessNodeColumnDetails.
        :rtype: str
        """
        return self._parent_id

    @parent_id.setter
    def parent_id(self, parent_id):
        """
        Sets the parent_id of this ProcessNodeColumnDetails.
        Unique identifier of the parent artifact containing the column.


        :param parent_id: The parent_id of this ProcessNodeColumnDetails.
        :type: str
        """
        self._parent_id = parent_id

    @property
    def parent_qualified_name(self):
        """
        **[Required]** Gets the parent_qualified_name of this ProcessNodeColumnDetails.
        Qualified name of the parent artifact containing the column.


        :return: The parent_qualified_name of this ProcessNodeColumnDetails.
        :rtype: str
        """
        return self._parent_qualified_name

    @parent_qualified_name.setter
    def parent_qualified_name(self, parent_qualified_name):
        """
        Sets the parent_qualified_name of this ProcessNodeColumnDetails.
        Qualified name of the parent artifact containing the column.


        :param parent_qualified_name: The parent_qualified_name of this ProcessNodeColumnDetails.
        :type: str
        """
        self._parent_qualified_name = parent_qualified_name

    @property
    def parent_type(self):
        """
        **[Required]** Gets the parent_type of this ProcessNodeColumnDetails.
        Type of the parent artifact containing the column.


        :return: The parent_type of this ProcessNodeColumnDetails.
        :rtype: str
        """
        return self._parent_type

    @parent_type.setter
    def parent_type(self, parent_type):
        """
        Sets the parent_type of this ProcessNodeColumnDetails.
        Type of the parent artifact containing the column.


        :param parent_type: The parent_type of this ProcessNodeColumnDetails.
        :type: str
        """
        self._parent_type = parent_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
