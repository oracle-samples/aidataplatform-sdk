# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OacChildItemSummary(object):
    """
    Summary information about a direct child item returned from an Oracle Analytics catalog browse request.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OacChildItemSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this OacChildItemSummary.
        :type id: str

        :param parent_id:
            The value to assign to the parent_id property of this OacChildItemSummary.
        :type parent_id: str

        :param name:
            The value to assign to the name property of this OacChildItemSummary.
        :type name: str

        :param path:
            The value to assign to the path property of this OacChildItemSummary.
        :type path: str

        :param owner:
            The value to assign to the owner property of this OacChildItemSummary.
        :type owner: str

        :param type:
            The value to assign to the type property of this OacChildItemSummary.
        :type type: str

        :param time_last_modified:
            The value to assign to the time_last_modified property of this OacChildItemSummary.
        :type time_last_modified: datetime

        """
        self.swagger_types = {
            'id': 'str',
            'parent_id': 'str',
            'name': 'str',
            'path': 'str',
            'owner': 'str',
            'type': 'str',
            'time_last_modified': 'datetime'
        }

        self.attribute_map = {
            'id': 'id',
            'parent_id': 'parentId',
            'name': 'name',
            'path': 'path',
            'owner': 'owner',
            'type': 'type',
            'time_last_modified': 'timeLastModified'
        }

        self._id = None
        self._parent_id = None
        self._name = None
        self._path = None
        self._owner = None
        self._type = None
        self._time_last_modified = None

    @property
    def id(self):
        """
        Gets the id of this OacChildItemSummary.
        The item identifier.


        :return: The id of this OacChildItemSummary.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this OacChildItemSummary.
        The item identifier.


        :param id: The id of this OacChildItemSummary.
        :type: str
        """
        self._id = id

    @property
    def parent_id(self):
        """
        Gets the parent_id of this OacChildItemSummary.
        The parent folder identifier.


        :return: The parent_id of this OacChildItemSummary.
        :rtype: str
        """
        return self._parent_id

    @parent_id.setter
    def parent_id(self, parent_id):
        """
        Sets the parent_id of this OacChildItemSummary.
        The parent folder identifier.


        :param parent_id: The parent_id of this OacChildItemSummary.
        :type: str
        """
        self._parent_id = parent_id

    @property
    def name(self):
        """
        Gets the name of this OacChildItemSummary.
        The item display name.


        :return: The name of this OacChildItemSummary.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this OacChildItemSummary.
        The item display name.


        :param name: The name of this OacChildItemSummary.
        :type: str
        """
        self._name = name

    @property
    def path(self):
        """
        Gets the path of this OacChildItemSummary.
        The Oracle Analytics catalog path for the item.


        :return: The path of this OacChildItemSummary.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this OacChildItemSummary.
        The Oracle Analytics catalog path for the item.


        :param path: The path of this OacChildItemSummary.
        :type: str
        """
        self._path = path

    @property
    def owner(self):
        """
        Gets the owner of this OacChildItemSummary.
        The item owner.


        :return: The owner of this OacChildItemSummary.
        :rtype: str
        """
        return self._owner

    @owner.setter
    def owner(self, owner):
        """
        Sets the owner of this OacChildItemSummary.
        The item owner.


        :param owner: The owner of this OacChildItemSummary.
        :type: str
        """
        self._owner = owner

    @property
    def type(self):
        """
        Gets the type of this OacChildItemSummary.
        The Oracle Analytics object type returned by the connector.


        :return: The type of this OacChildItemSummary.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this OacChildItemSummary.
        The Oracle Analytics object type returned by the connector.


        :param type: The type of this OacChildItemSummary.
        :type: str
        """
        self._type = type

    @property
    def time_last_modified(self):
        """
        Gets the time_last_modified of this OacChildItemSummary.
        The last modified time reported by Oracle Analytics for the item.


        :return: The time_last_modified of this OacChildItemSummary.
        :rtype: datetime
        """
        return self._time_last_modified

    @time_last_modified.setter
    def time_last_modified(self, time_last_modified):
        """
        Sets the time_last_modified of this OacChildItemSummary.
        The last modified time reported by Oracle Analytics for the item.


        :param time_last_modified: The time_last_modified of this OacChildItemSummary.
        :type: datetime
        """
        self._time_last_modified = time_last_modified

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
