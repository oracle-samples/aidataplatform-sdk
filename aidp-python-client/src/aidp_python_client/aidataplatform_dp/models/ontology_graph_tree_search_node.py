# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphTreeSearchNode(object):
    """
    Lazy-loaded ontology tree node.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphTreeSearchNode object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param uid:
            The value to assign to the uid property of this OntologyGraphTreeSearchNode.
        :type uid: str

        :param parent_uid:
            The value to assign to the parent_uid property of this OntologyGraphTreeSearchNode.
        :type parent_uid: str

        :param type:
            The value to assign to the type property of this OntologyGraphTreeSearchNode.
        :type type: str

        :param name:
            The value to assign to the name property of this OntologyGraphTreeSearchNode.
        :type name: str

        :param display_name:
            The value to assign to the display_name property of this OntologyGraphTreeSearchNode.
        :type display_name: str

        :param has_children:
            The value to assign to the has_children property of this OntologyGraphTreeSearchNode.
        :type has_children: bool

        :param context_path:
            The value to assign to the context_path property of this OntologyGraphTreeSearchNode.
        :type context_path: list[oci.aidataplatform_dp.models.OntologyGraphTreeContextPathItem]

        """
        self.swagger_types = {
            'uid': 'str',
            'parent_uid': 'str',
            'type': 'str',
            'name': 'str',
            'display_name': 'str',
            'has_children': 'bool',
            'context_path': 'list[OntologyGraphTreeContextPathItem]'
        }

        self.attribute_map = {
            'uid': 'uid',
            'parent_uid': 'parentUid',
            'type': 'type',
            'name': 'name',
            'display_name': 'displayName',
            'has_children': 'hasChildren',
            'context_path': 'contextPath'
        }

        self._uid = None
        self._parent_uid = None
        self._type = None
        self._name = None
        self._display_name = None
        self._has_children = None
        self._context_path = None

    @property
    def uid(self):
        """
        **[Required]** Gets the uid of this OntologyGraphTreeSearchNode.
        Stable unique identifier used as parentUid on expansion requests.


        :return: The uid of this OntologyGraphTreeSearchNode.
        :rtype: str
        """
        return self._uid

    @uid.setter
    def uid(self, uid):
        """
        Sets the uid of this OntologyGraphTreeSearchNode.
        Stable unique identifier used as parentUid on expansion requests.


        :param uid: The uid of this OntologyGraphTreeSearchNode.
        :type: str
        """
        self._uid = uid

    @property
    def parent_uid(self):
        """
        Gets the parent_uid of this OntologyGraphTreeSearchNode.
        Parent node UID, or null for root ontology nodes.


        :return: The parent_uid of this OntologyGraphTreeSearchNode.
        :rtype: str
        """
        return self._parent_uid

    @parent_uid.setter
    def parent_uid(self, parent_uid):
        """
        Sets the parent_uid of this OntologyGraphTreeSearchNode.
        Parent node UID, or null for root ontology nodes.


        :param parent_uid: The parent_uid of this OntologyGraphTreeSearchNode.
        :type: str
        """
        self._parent_uid = parent_uid

    @property
    def type(self):
        """
        **[Required]** Gets the type of this OntologyGraphTreeSearchNode.
        Node type. Supported values include ontology, class, subclass, relationship, property, constraint, and annotation.


        :return: The type of this OntologyGraphTreeSearchNode.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this OntologyGraphTreeSearchNode.
        Node type. Supported values include ontology, class, subclass, relationship, property, constraint, and annotation.


        :param type: The type of this OntologyGraphTreeSearchNode.
        :type: str
        """
        self._type = type

    @property
    def name(self):
        """
        **[Required]** Gets the name of this OntologyGraphTreeSearchNode.

        :return: The name of this OntologyGraphTreeSearchNode.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this OntologyGraphTreeSearchNode.

        :param name: The name of this OntologyGraphTreeSearchNode.
        :type: str
        """
        self._name = name

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this OntologyGraphTreeSearchNode.

        :return: The display_name of this OntologyGraphTreeSearchNode.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this OntologyGraphTreeSearchNode.

        :param display_name: The display_name of this OntologyGraphTreeSearchNode.
        :type: str
        """
        self._display_name = display_name

    @property
    def has_children(self):
        """
        **[Required]** Gets the has_children of this OntologyGraphTreeSearchNode.

        :return: The has_children of this OntologyGraphTreeSearchNode.
        :rtype: bool
        """
        return self._has_children

    @has_children.setter
    def has_children(self, has_children):
        """
        Sets the has_children of this OntologyGraphTreeSearchNode.

        :param has_children: The has_children of this OntologyGraphTreeSearchNode.
        :type: bool
        """
        self._has_children = has_children

    @property
    def context_path(self):
        """
        **[Required]** Gets the context_path of this OntologyGraphTreeSearchNode.
        Root-to-item context path for this tree node.


        :return: The context_path of this OntologyGraphTreeSearchNode.
        :rtype: list[oci.aidataplatform_dp.models.OntologyGraphTreeContextPathItem]
        """
        return self._context_path

    @context_path.setter
    def context_path(self, context_path):
        """
        Sets the context_path of this OntologyGraphTreeSearchNode.
        Root-to-item context path for this tree node.


        :param context_path: The context_path of this OntologyGraphTreeSearchNode.
        :type: list[oci.aidataplatform_dp.models.OntologyGraphTreeContextPathItem]
        """
        self._context_path = context_path

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
