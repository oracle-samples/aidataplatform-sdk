# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OacObjectSummary(object):
    """
    Summary information about an Oracle Analytics object.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OacObjectSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this OacObjectSummary.
        :type id: str

        :param parent_id:
            The value to assign to the parent_id property of this OacObjectSummary.
        :type parent_id: str

        :param name:
            The value to assign to the name property of this OacObjectSummary.
        :type name: str

        :param description:
            The value to assign to the description property of this OacObjectSummary.
        :type description: str

        :param path:
            The value to assign to the path property of this OacObjectSummary.
        :type path: str

        :param owner:
            The value to assign to the owner property of this OacObjectSummary.
        :type owner: str

        :param type:
            The value to assign to the type property of this OacObjectSummary.
        :type type: str

        :param object_id:
            The value to assign to the object_id property of this OacObjectSummary.
        :type object_id: str

        :param time_last_modified:
            The value to assign to the time_last_modified property of this OacObjectSummary.
        :type time_last_modified: datetime

        """
        self.swagger_types = {
            'id': 'str',
            'parent_id': 'str',
            'name': 'str',
            'description': 'str',
            'path': 'str',
            'owner': 'str',
            'type': 'str',
            'object_id': 'str',
            'time_last_modified': 'datetime'
        }

        self.attribute_map = {
            'id': 'id',
            'parent_id': 'parentId',
            'name': 'name',
            'description': 'description',
            'path': 'path',
            'owner': 'owner',
            'type': 'type',
            'object_id': 'objectId',
            'time_last_modified': 'timeLastModified'
        }

        self._id = None
        self._parent_id = None
        self._name = None
        self._description = None
        self._path = None
        self._owner = None
        self._type = None
        self._object_id = None
        self._time_last_modified = None

    @property
    def id(self):
        """
        Gets the id of this OacObjectSummary.
        The Oracle Analytics object identifier.


        :return: The id of this OacObjectSummary.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this OacObjectSummary.
        The Oracle Analytics object identifier.


        :param id: The id of this OacObjectSummary.
        :type: str
        """
        self._id = id

    @property
    def parent_id(self):
        """
        Gets the parent_id of this OacObjectSummary.
        The parent folder identifier when available.


        :return: The parent_id of this OacObjectSummary.
        :rtype: str
        """
        return self._parent_id

    @parent_id.setter
    def parent_id(self, parent_id):
        """
        Sets the parent_id of this OacObjectSummary.
        The parent folder identifier when available.


        :param parent_id: The parent_id of this OacObjectSummary.
        :type: str
        """
        self._parent_id = parent_id

    @property
    def name(self):
        """
        Gets the name of this OacObjectSummary.
        The Oracle Analytics object display name.


        :return: The name of this OacObjectSummary.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this OacObjectSummary.
        The Oracle Analytics object display name.


        :param name: The name of this OacObjectSummary.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this OacObjectSummary.
        The Oracle Analytics object description.


        :return: The description of this OacObjectSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this OacObjectSummary.
        The Oracle Analytics object description.


        :param description: The description of this OacObjectSummary.
        :type: str
        """
        self._description = description

    @property
    def path(self):
        """
        Gets the path of this OacObjectSummary.
        The Oracle Analytics catalog path for the object when available.


        :return: The path of this OacObjectSummary.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this OacObjectSummary.
        The Oracle Analytics catalog path for the object when available.


        :param path: The path of this OacObjectSummary.
        :type: str
        """
        self._path = path

    @property
    def owner(self):
        """
        Gets the owner of this OacObjectSummary.
        The Oracle Analytics object owner when available.


        :return: The owner of this OacObjectSummary.
        :rtype: str
        """
        return self._owner

    @owner.setter
    def owner(self, owner):
        """
        Sets the owner of this OacObjectSummary.
        The Oracle Analytics object owner when available.


        :param owner: The owner of this OacObjectSummary.
        :type: str
        """
        self._owner = owner

    @property
    def type(self):
        """
        Gets the type of this OacObjectSummary.
        The Oracle Analytics object type.


        :return: The type of this OacObjectSummary.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this OacObjectSummary.
        The Oracle Analytics object type.


        :param type: The type of this OacObjectSummary.
        :type: str
        """
        self._type = type

    @property
    def object_id(self):
        """
        Gets the object_id of this OacObjectSummary.
        The Oracle Analytics object identifier returned for dataset-backed items when available.


        :return: The object_id of this OacObjectSummary.
        :rtype: str
        """
        return self._object_id

    @object_id.setter
    def object_id(self, object_id):
        """
        Sets the object_id of this OacObjectSummary.
        The Oracle Analytics object identifier returned for dataset-backed items when available.


        :param object_id: The object_id of this OacObjectSummary.
        :type: str
        """
        self._object_id = object_id

    @property
    def time_last_modified(self):
        """
        Gets the time_last_modified of this OacObjectSummary.
        The last modified time reported by Oracle Analytics for the object.


        :return: The time_last_modified of this OacObjectSummary.
        :rtype: datetime
        """
        return self._time_last_modified

    @time_last_modified.setter
    def time_last_modified(self, time_last_modified):
        """
        Sets the time_last_modified of this OacObjectSummary.
        The last modified time reported by Oracle Analytics for the object.


        :param time_last_modified: The time_last_modified of this OacObjectSummary.
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
