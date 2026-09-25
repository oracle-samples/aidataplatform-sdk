# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphPreviewNodeExpansion(object):
    """
    Hierarchy expansion metadata for a graph node.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphPreviewNodeExpansion object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param child_count:
            The value to assign to the child_count property of this OntologyGraphPreviewNodeExpansion.
        :type child_count: int

        :param has_children:
            The value to assign to the has_children property of this OntologyGraphPreviewNodeExpansion.
        :type has_children: bool

        :param has_more_children:
            The value to assign to the has_more_children property of this OntologyGraphPreviewNodeExpansion.
        :type has_more_children: bool

        :param loaded_child_count:
            The value to assign to the loaded_child_count property of this OntologyGraphPreviewNodeExpansion.
        :type loaded_child_count: int

        :param next_child_cursor:
            The value to assign to the next_child_cursor property of this OntologyGraphPreviewNodeExpansion.
        :type next_child_cursor: str

        :param is_root:
            The value to assign to the is_root property of this OntologyGraphPreviewNodeExpansion.
        :type is_root: bool

        """
        self.swagger_types = {
            'child_count': 'int',
            'has_children': 'bool',
            'has_more_children': 'bool',
            'loaded_child_count': 'int',
            'next_child_cursor': 'str',
            'is_root': 'bool'
        }

        self.attribute_map = {
            'child_count': 'childCount',
            'has_children': 'hasChildren',
            'has_more_children': 'hasMoreChildren',
            'loaded_child_count': 'loadedChildCount',
            'next_child_cursor': 'nextChildCursor',
            'is_root': 'isRoot'
        }

        self._child_count = None
        self._has_children = None
        self._has_more_children = None
        self._loaded_child_count = None
        self._next_child_cursor = None
        self._is_root = None

    @property
    def child_count(self):
        """
        **[Required]** Gets the child_count of this OntologyGraphPreviewNodeExpansion.
        Total direct child relationship count for this node.


        :return: The child_count of this OntologyGraphPreviewNodeExpansion.
        :rtype: int
        """
        return self._child_count

    @child_count.setter
    def child_count(self, child_count):
        """
        Sets the child_count of this OntologyGraphPreviewNodeExpansion.
        Total direct child relationship count for this node.


        :param child_count: The child_count of this OntologyGraphPreviewNodeExpansion.
        :type: int
        """
        self._child_count = child_count

    @property
    def has_children(self):
        """
        **[Required]** Gets the has_children of this OntologyGraphPreviewNodeExpansion.
        Whether this node has any direct child relationships.


        :return: The has_children of this OntologyGraphPreviewNodeExpansion.
        :rtype: bool
        """
        return self._has_children

    @has_children.setter
    def has_children(self, has_children):
        """
        Sets the has_children of this OntologyGraphPreviewNodeExpansion.
        Whether this node has any direct child relationships.


        :param has_children: The has_children of this OntologyGraphPreviewNodeExpansion.
        :type: bool
        """
        self._has_children = has_children

    @property
    def has_more_children(self):
        """
        **[Required]** Gets the has_more_children of this OntologyGraphPreviewNodeExpansion.
        Whether more direct child relationships can be loaded for this node in paged hierarchy mode.


        :return: The has_more_children of this OntologyGraphPreviewNodeExpansion.
        :rtype: bool
        """
        return self._has_more_children

    @has_more_children.setter
    def has_more_children(self, has_more_children):
        """
        Sets the has_more_children of this OntologyGraphPreviewNodeExpansion.
        Whether more direct child relationships can be loaded for this node in paged hierarchy mode.


        :param has_more_children: The has_more_children of this OntologyGraphPreviewNodeExpansion.
        :type: bool
        """
        self._has_more_children = has_more_children

    @property
    def loaded_child_count(self):
        """
        **[Required]** Gets the loaded_child_count of this OntologyGraphPreviewNodeExpansion.
        Number of direct child relationships represented in the returned graph.


        :return: The loaded_child_count of this OntologyGraphPreviewNodeExpansion.
        :rtype: int
        """
        return self._loaded_child_count

    @loaded_child_count.setter
    def loaded_child_count(self, loaded_child_count):
        """
        Sets the loaded_child_count of this OntologyGraphPreviewNodeExpansion.
        Number of direct child relationships represented in the returned graph.


        :param loaded_child_count: The loaded_child_count of this OntologyGraphPreviewNodeExpansion.
        :type: int
        """
        self._loaded_child_count = loaded_child_count

    @property
    def next_child_cursor(self):
        """
        Gets the next_child_cursor of this OntologyGraphPreviewNodeExpansion.
        Cursor for loading the next direct child page for this node.


        :return: The next_child_cursor of this OntologyGraphPreviewNodeExpansion.
        :rtype: str
        """
        return self._next_child_cursor

    @next_child_cursor.setter
    def next_child_cursor(self, next_child_cursor):
        """
        Sets the next_child_cursor of this OntologyGraphPreviewNodeExpansion.
        Cursor for loading the next direct child page for this node.


        :param next_child_cursor: The next_child_cursor of this OntologyGraphPreviewNodeExpansion.
        :type: str
        """
        self._next_child_cursor = next_child_cursor

    @property
    def is_root(self):
        """
        **[Required]** Gets the is_root of this OntologyGraphPreviewNodeExpansion.
        Whether this node was returned as a root or parent page item.


        :return: The is_root of this OntologyGraphPreviewNodeExpansion.
        :rtype: bool
        """
        return self._is_root

    @is_root.setter
    def is_root(self, is_root):
        """
        Sets the is_root of this OntologyGraphPreviewNodeExpansion.
        Whether this node was returned as a root or parent page item.


        :param is_root: The is_root of this OntologyGraphPreviewNodeExpansion.
        :type: bool
        """
        self._is_root = is_root

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
